package io.hrms.business.abstracts;

import java.util.List;


import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();

	DataResult<JobPosition> getByid(int id);

	Result add(JobPosition jobPosition);

	Result update(JobPosition jobPosition);

	Result delete(JobPosition jobPosition);
	
	DataResult<JobPosition>getByJobTitle(String jobTitle);
}
