package io.hrms.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {
	
	Result add(JobAdvert jobAdvert);
	Result update(JobAdvert jobAdvert);
	Result delete(int id);
	Result changeAdvertStatusClose(int id);
	DataResult<List<JobAdvert>>getAllByJobAdvertStatusList();
	DataResult<List<JobAdvert>>getAll();
	DataResult<List<JobAdvert>>getAllByCretedAtDesc();
	DataResult<List<JobAdvert>>getByAdvertStatus(boolean status); 
	DataResult<List<JobAdvert>>getAllByEmployerOpenAdvert(int id);
	//DataResult<List<JobAdvert>>getByEmployer_userId(int userId);
	DataResult<JobAdvert>getById(int id);
	DataResult<List<JobAdvert>>getAllByDeadlineLessThanEqual(LocalDate date);
	
}








