package io.hrms.core.utilities.verification;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class VerificationCodeManager implements VerificationCodeService {

	@Override
	public String createCode() {
		
		UUID uuid = UUID.randomUUID();
		String code = uuid.toString().replace("-", "");
		
		return code;
	}

}
