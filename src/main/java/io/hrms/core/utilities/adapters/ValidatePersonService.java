package io.hrms.core.utilities.adapters;

import io.hrms.entities.concretes.JobSeeker;

public interface ValidatePersonService {
	boolean CheckIfRealPerson(JobSeeker jobSeeker);

}
