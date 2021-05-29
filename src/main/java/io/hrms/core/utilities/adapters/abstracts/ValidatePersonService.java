package io.hrms.core.utilities.adapters.abstracts;

public interface ValidatePersonService {
	boolean CheckIfRealPerson(long nationalId, String firstName, String lastName, int yearOfBirth);

}
