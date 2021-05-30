package io.hrms.dataAccess.abstracts;

import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Employer;
import io.hrms.entities.concretes.JobSeeker;

public interface AuthService {
	
	Result registerForEmployer(Employer employer, String password);
	Result registerForJobSeeker(JobSeeker jobseeker, String password);

}
