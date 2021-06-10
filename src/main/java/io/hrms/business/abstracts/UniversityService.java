package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;

import io.hrms.entities.concretes.University;

public interface UniversityService {
	
    Result add(University university);
	
	Result update(University university); 
	Result delete(int id); 
	DataResult<List<University>>getAll();
	

}
