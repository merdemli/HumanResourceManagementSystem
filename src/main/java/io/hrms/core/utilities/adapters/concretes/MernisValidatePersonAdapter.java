package io.hrms.core.utilities.adapters.concretes;

import io.hrms.core.utilities.adapters.abstracts.ValidatePersonService;
import io.hrms.mernisService.FakeMernisValidationService;

public class MernisValidatePersonAdapter implements ValidatePersonService{

	@Override
	public boolean CheckIfRealPerson(long nationalId, String firstName, String lastName, int yearOfBirth) {

		FakeMernisValidationService client = new FakeMernisValidationService();

		try {
			return client.ValidatePerson(nationalId, firstName, lastName, yearOfBirth);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}

}
