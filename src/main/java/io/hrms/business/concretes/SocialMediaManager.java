package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.SocialMediaService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.SocialMediaDao;
import io.hrms.entities.concretes.SocialMedia;

@Service
public class SocialMediaManager implements SocialMediaService{
	
	private SocialMediaDao socialMediaDao;

	@Autowired
	public SocialMediaManager(SocialMediaDao socialMediaDao) {
		super();
		this.socialMediaDao = socialMediaDao;
	}

	@Override
	public Result add(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult("social media added");
	}

	@Override
	public DataResult<List<SocialMedia>> getAll() {
		
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.findAll(),"social media successfuly listed");
		}

}
