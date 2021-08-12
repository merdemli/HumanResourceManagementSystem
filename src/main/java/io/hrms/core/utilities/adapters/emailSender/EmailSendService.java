package io.hrms.core.utilities.adapters.emailSender;

import io.hrms.core.utilities.results.Result;

public interface EmailSendService {
	
	Result run(String emailAdress);
	
	

}
