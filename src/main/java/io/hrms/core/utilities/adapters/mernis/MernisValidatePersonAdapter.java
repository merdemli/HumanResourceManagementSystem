package io.hrms.core.utilities.adapters.mernis;

import org.springframework.stereotype.Service;

import io.hrms.entities.concretes.JobSeeker;
import io.hrms.mernisService.FakeMernisValidationService;

@Service
public class MernisValidatePersonAdapter implements ValidatePersonService{

	@Override
	public boolean CheckIfRealPerson(JobSeeker jobSeeker ){

		FakeMernisValidationService client = new FakeMernisValidationService();
	
           boolean result= client.validatePerson(jobSeeker);
           result = true;
		   return result;

	

}
}
