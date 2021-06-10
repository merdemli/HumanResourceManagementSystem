package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.ForeignLanguageForCv;
import io.hrms.entities.concretes.WorkExperienceForCV;

public interface WorkExperienceForCvService {

	Result add(WorkExperienceForCV workExperinceForCV); 
	Result update(WorkExperienceForCV workExperinceForCV); 
	Result delete(int id); 
	DataResult<List<WorkExperienceForCV>>getAll();
	DataResult<WorkExperienceForCV>getById(int id);
	//DataResult<List<WorkExperienceForCV>>getAllByCVId(int id);
	

}
