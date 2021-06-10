package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.CoverLetterForCvService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.CoverLetterForCVDao;
import io.hrms.entities.concretes.CoverLetterForCV;


@Service
public class CoverLetterForCvManager implements CoverLetterForCvService{
	
	private CoverLetterForCVDao coverLetterForCVDao;

	@Autowired
	public CoverLetterForCvManager(CoverLetterForCVDao coverLetterForCVDao) {
		super();
		this.coverLetterForCVDao = coverLetterForCVDao;
	}

	@Override
	public Result add(CoverLetterForCV coverLetterForCv) {
		this.coverLetterForCVDao.save(coverLetterForCv);
		return new SuccessResult("cover letter has been added");
	}

	@Override
	public Result update(CoverLetterForCV coverLetterForCv) {
		this.coverLetterForCVDao.save(coverLetterForCv);
		return new SuccessResult("cover letter has been updated");
	}

	@Override
	public Result delete(int id) {
		this.coverLetterForCVDao.deleteById(id);
		return new SuccessResult("cover letter has been deleted");
	}

	@Override
	public DataResult<List<CoverLetterForCV>> getAll() {
		
		return new SuccessDataResult<List<CoverLetterForCV>>(this.coverLetterForCVDao.findAll(),"cover letters listed");
	}

	@Override
	public DataResult<CoverLetterForCV> getById(int id) {
		
		return new SuccessDataResult<CoverLetterForCV>(this.coverLetterForCVDao.getById(id));
	}

//	@Override
//	public DataResult<List<CoverLetterForCV>> getallByCVId(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
