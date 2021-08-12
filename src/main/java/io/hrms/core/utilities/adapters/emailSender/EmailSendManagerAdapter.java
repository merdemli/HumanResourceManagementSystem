package io.hrms.core.utilities.adapters.emailSender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.core.utilities.verification.VerificationCodeService;
import io.hrms.entities.concretes.Email;
import io.hrms.outSourceServices.emailSenderService.EmailSenderManager;


@Service
public class EmailSendManagerAdapter implements EmailSendService {
	
	
	private VerificationCodeService verificationCodeService;
	
	private static Logger log = LoggerFactory.getLogger(EmailSenderManager.class);

	@Autowired
	public EmailSendManagerAdapter(VerificationCodeService verificationCodeService) { //adapter design pattern
		
		this.verificationCodeService = verificationCodeService;
	}

	@Override
	public Result run(String emailAdress) {
		
		EmailSenderManager mailSenderManager = new EmailSenderManager();
		
		 String verificationCode = this.verificationCodeService.createCode();
		 
		 log.info("HRMS - Verification Code sent");
		 
		 Email mail = new Email();
		 mail.setFrom("hrms@hrms.com");
		 mail.setTo(emailAdress);
		 mail.setSubject("HRMS ; Verification Code");
		 mail.setContent(" Hi! Please verify your account. Verification code:  " +verificationCode);
		 
		 mailSenderManager.sendSimpleMessage(mail);
		 
		 
		return new SuccessResult("Email have already sent");
	}

	

}
