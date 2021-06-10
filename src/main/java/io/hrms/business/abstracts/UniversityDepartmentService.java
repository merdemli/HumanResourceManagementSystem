package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.UniversityDepartment;


public interface UniversityDepartmentService {
	
    Result add(UniversityDepartment universityDepartment);
	
	Result update(UniversityDepartment universityDepartment); 
	Result delete(int id); 
	DataResult<List<UniversityDepartment>>getAll();


}
