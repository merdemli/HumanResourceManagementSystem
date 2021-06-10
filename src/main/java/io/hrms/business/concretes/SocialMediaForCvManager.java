package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.SocialMediaForCVService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.SocialMediaForCVDao;

import io.hrms.entities.concretes.SocialMediaForCV;


@Service
public class SocialMediaForCvManager implements SocialMediaForCVService{
	
	private SocialMediaForCVDao socialMediaForCVDao;

	@Autowired
	public SocialMediaForCvManager(SocialMediaForCVDao socialMediaForCVDao) {
		super();
		this.socialMediaForCVDao = socialMediaForCVDao;
	}

	@Override
	public Result add(SocialMediaForCV socialMediaForCV) {
		this.socialMediaForCVDao.save(socialMediaForCV);
		return new SuccessResult("added");
	
		}
	

	@Override
	public Result update(SocialMediaForCV socialMediaForCV) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<SocialMediaForCV>> getAll() {
		
		return new SuccessDataResult<List<SocialMediaForCV>>(this.socialMediaForCVDao.findAll());
	}

	@Override
	public DataResult<SocialMediaForCV> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
