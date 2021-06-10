package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Technology;


public interface TechnologyService {
	
    Result add(Technology technology );
	
	Result update(Technology technology); 
	Result delete(int id); 
	DataResult<List<Technology>>getAll();
	DataResult<Technology>getById(int id);
	

}
