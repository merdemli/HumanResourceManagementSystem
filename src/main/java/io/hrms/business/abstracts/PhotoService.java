package io.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Photo;

public interface PhotoService {
	
	Result add(Photo photo, MultipartFile imageFile);
	
	Result update(Photo photo); 
	Result delete(int id); 
	DataResult<List<Photo>>getAll();
	DataResult<Photo>getById(int id);
	//DataResult<List<Photo>>getAllByCVId(int id);

}
