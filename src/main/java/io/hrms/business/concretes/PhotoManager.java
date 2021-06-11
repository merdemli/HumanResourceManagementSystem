package io.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import io.hrms.business.abstracts.PhotoService;
import io.hrms.core.utilities.adapters.imageUpload.CloudinaryService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.PhotoDao;
import io.hrms.entities.concretes.Photo;

@Service
public class PhotoManager implements PhotoService{
	
	
	private PhotoDao photoDao;
	private CloudinaryService cloudinaryService;
	
	@Autowired
	PhotoManager(PhotoDao photoDao, CloudinaryService cloudinaryService) {
		super();
		this.photoDao = photoDao;
		this.cloudinaryService = cloudinaryService;
	}

	
	@Override
	public Result add(Photo photo, MultipartFile imageFile) {
		Map<String,String> uploadImage = this.cloudinaryService.uploadImageFile(imageFile).getData();
		photo.setPhotoURL(uploadImage.get("url"));
		this.photoDao.save(photo);
		return new SuccessResult("Image has been added.");
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
		
		return new SuccessDataResult<List<Photo>>(this.photoDao.findAll(), "images listed");
	}

	@Override
	public DataResult<Photo> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
