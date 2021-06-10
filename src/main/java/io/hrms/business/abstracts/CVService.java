package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.CV;


public interface CVService {
	Result add(CV cv);
	Result update(CV cv); 
	Result delete(int id); 
	DataResult<List<CV>>getAll();

	DataResult<List<CV>>getByJobSeekerId(int userId );

}


