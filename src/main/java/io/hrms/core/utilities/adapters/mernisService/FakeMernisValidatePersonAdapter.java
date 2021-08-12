package io.hrms.core.utilities.adapters.mernisService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import io.hrms.entities.concretes.JobSeeker;
import io.hrms.outSourceServices.fakeMernisService.FakeMernisValidationService;

@Component
@Primary
public class FakeMernisValidatePersonAdapter implements ValidatePersonService{

	@Override
	public boolean CheckIfRealPerson(JobSeeker jobSeeker ){

		FakeMernisValidationService client = new FakeMernisValidationService();
	
           boolean result= client.validatePerson(jobSeeker);
           result = true;
		   return result;

	//simulation

}
}
