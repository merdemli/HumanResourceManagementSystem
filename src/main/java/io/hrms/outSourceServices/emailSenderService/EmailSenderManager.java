package io.hrms.outSourceServices.emailSenderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import io.hrms.entities.concretes.Email;

public class EmailSenderManager {
	
	@Autowired
	private JavaMailSender mailSender;

	
	
	public void sendSimpleMessage(Email email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setSubject(email.getSubject());
		message.setText(email.getContent());
		message.setTo(email.getTo());
		message.setFrom(email.getFrom());
		
		mailSender.send(message);
		
		System.out.println("Mail sent successfully to "+email+ " adress");
	
	
	
	}

}
