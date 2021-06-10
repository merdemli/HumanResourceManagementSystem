package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.EducationInfoForCV;

public interface EducationInfoForCVService {
	
	Result add(EducationInfoForCV educationInfoForCV); 
	Result update(EducationInfoForCV educationInfoForCV); 
	Result delete(int id); 
	DataResult<List<EducationInfoForCV >>getAll();
	DataResult<EducationInfoForCV >getById(int id);
	//DataResult<List<EducationInfoForCV>>getAllByCVId(int id);

}

