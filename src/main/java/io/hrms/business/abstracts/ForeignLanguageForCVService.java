package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.EducationInfoForCV;
import io.hrms.entities.concretes.ForeignLanguageForCv;

public interface ForeignLanguageForCVService {
	
	Result add(ForeignLanguageForCv foreignLanguageForCv); 
	Result update(ForeignLanguageForCv foreignLanguageForCv); 
	Result delete(int id); 
	DataResult<List<ForeignLanguageForCv>>getAll();
	DataResult<ForeignLanguageForCv >getById(int id);
	//DataResult<List<ForeignLanguageForCv>>getAllByCVId(int id);


}
