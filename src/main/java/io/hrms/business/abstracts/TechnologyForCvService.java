package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Photo;
import io.hrms.entities.concretes.TechnologyForCV;

public interface TechnologyForCvService {
	
	Result add(TechnologyForCV technologyForCV  );
	
	Result update(TechnologyForCV technologyForCV );  
	Result delete(int id); 
	DataResult<List<TechnologyForCV>>getAll();
	DataResult<TechnologyForCV>getById(int id);
	//DataResult<List<TechnologyForCV>>getAllByCVId(int id);

}


