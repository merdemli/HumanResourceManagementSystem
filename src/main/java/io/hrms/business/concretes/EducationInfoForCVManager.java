package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.EducationInfoForCVService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.EducationInfoForCVDao;
import io.hrms.entities.concretes.CoverLetterForCV;
import io.hrms.entities.concretes.EducationInfoForCV;

@Service
public class EducationInfoForCVManager implements EducationInfoForCVService{
	
	private EducationInfoForCVDao educationInfoForCVDao;

	@Autowired
	public EducationInfoForCVManager(EducationInfoForCVDao educationInfoForCVDao) {
		super();
		this.educationInfoForCVDao = educationInfoForCVDao;
	}
	
	

	@Override
	public Result add(EducationInfoForCV educationInfoForCV) {
		this.educationInfoForCVDao.save(educationInfoForCV);
		return new SuccessResult("Education info have been added");
	}

	@Override
	public Result update(EducationInfoForCV educationInfoForCV) {
		this.educationInfoForCVDao.save(educationInfoForCV);
		return new SuccessResult("Education info have been updated");
	}


	@Override
	public Result delete(int id) {
		this.educationInfoForCVDao.deleteById(id);
		return new SuccessResult("Education info have been deleted");
	}


	@Override
	public DataResult<List<EducationInfoForCV>> getAll() {
		return new SuccessDataResult<List<EducationInfoForCV>>(this.educationInfoForCVDao.findAll());
	}



	@Override
	public DataResult<EducationInfoForCV> getById(int id) {
		return new SuccessDataResult<EducationInfoForCV>(this.educationInfoForCVDao.getById(id));
	}



//	@Override
//	public DataResult<List<EducationInfoForCV>> getAllByCVId(int id) {
//		return new SuccessDataResult<List<EducationInfoForCV>>(this.educationInfoForCVDao.getAllByCV_id(id)," listed by cv id");
//	}



	

}
