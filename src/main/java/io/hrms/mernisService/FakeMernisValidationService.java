package io.hrms.mernisService;

public class FakeMernisValidationService {
	
	public boolean ValidatePerson(long nationalId, String firstName, String lastName, int yearOfBirth) {
		
		System.out.println(firstName+ " " +lastName+ " is valid person");
		
		return true;
	}
	

}
