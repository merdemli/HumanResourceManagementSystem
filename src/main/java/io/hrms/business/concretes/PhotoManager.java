package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.PhotoService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.PhotoDao;
import io.hrms.entities.concretes.Photo;

@Service
public class PhotoManager implements PhotoService{
	
	@Autowired
	private PhotoDao photoDao;
	
	
	public PhotoManager(PhotoDao photoDao) {
		super();
		this.photoDao = photoDao;
	}

	@Override
	public Result add(Photo photo) {
		this.photoDao.save(photo);
		return new SuccessResult("photo added");
	}

	@Override
	public Result update(Photo photo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Photo>> getAll() {
		
		return new SuccessDataResult<List<Photo>>(this.photoDao.findAll());
	}

	@Override
	public DataResult<Photo> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
