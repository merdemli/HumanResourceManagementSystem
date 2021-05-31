package io.hrms.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll();

	Result add(JobSeeker jobSeeker);

	Result delete(JobSeeker jobSeeker);

	Result update(JobSeeker jobSeeker);

	DataResult<JobSeeker> getByDateOfBirth(LocalDate dateOfBirth);
	
	DataResult<JobSeeker> getByNationalId(String nationalId);

}
