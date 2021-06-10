package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;

import io.hrms.entities.concretes.SocialMediaForCV;

public interface SocialMediaForCVService{
Result add(SocialMediaForCV socialMediaForCV);
	
	Result update(SocialMediaForCV socialMediaForCV); 
	Result delete(int id); 
	DataResult<List<SocialMediaForCV>>getAll();
	DataResult<SocialMediaForCV>getById(int id);
	//DataResult<List<SocialMediaForCV>>getAllByCVId(int id);
	
	

}
