package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.CoverLetterForCV;

public interface CoverLetterForCvService {
	
	Result add(CoverLetterForCV coverLetterForCv); 
	Result update(CoverLetterForCV coverLetterForCv); 
	Result delete(int id); 
	DataResult<List<CoverLetterForCV>>getAll();
	DataResult<CoverLetterForCV>getById(int id);
	//DataResult<List<CoverLetterForCV>>getallByCVId(int id);

}
