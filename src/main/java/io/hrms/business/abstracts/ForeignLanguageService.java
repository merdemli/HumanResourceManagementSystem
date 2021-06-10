package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.ForeignLanguage;


public interface ForeignLanguageService {
	
Result add(ForeignLanguage foreignLanguage);
	
	Result update(ForeignLanguage foreignLanguage); 
	Result delete(int id); 
	DataResult<List<ForeignLanguage >>getAll();

}
