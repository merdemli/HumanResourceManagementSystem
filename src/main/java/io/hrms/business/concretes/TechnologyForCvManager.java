package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.TechnologyForCvService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.TechnologyForCVDao;

import io.hrms.entities.concretes.TechnologyForCV;


@Service
public class TechnologyForCvManager implements TechnologyForCvService {
	
	private TechnologyForCVDao technologyForCVDao;

	@Autowired
	public TechnologyForCvManager(TechnologyForCVDao technologyForCVDao) {
		super();
		this.technologyForCVDao = technologyForCVDao;
	}
	

	@Override
	public Result add(TechnologyForCV technologyForCV) {
		this.technologyForCVDao.save(technologyForCV);
		return new SuccessResult("added");
	}

	@Override
	public Result update(TechnologyForCV technologyForCV) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<TechnologyForCV>> getAll() {
		return new SuccessDataResult<List<TechnologyForCV>>(this.technologyForCVDao.findAll());
	}

	@Override
	public DataResult<TechnologyForCV> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
