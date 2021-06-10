package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.ForeignLanguageForCVService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.ForeignLanguageForCvDao;
import io.hrms.entities.concretes.ForeignLanguageForCv;

@Service
public class ForeignLanguageForCVManager implements ForeignLanguageForCVService{
	
	
	private ForeignLanguageForCvDao foreignLanguageForCvDao;

	@Autowired
	public ForeignLanguageForCVManager(ForeignLanguageForCvDao foreignLanguageForCvDao) {
		super();
		this.foreignLanguageForCvDao = foreignLanguageForCvDao;
	}

	@Override
	public Result add(ForeignLanguageForCv foreignLanguageForCv) {
		this.foreignLanguageForCvDao.save(foreignLanguageForCv);
		return new SuccessResult("added");
	}

	@Override
	public Result update(ForeignLanguageForCv foreignLanguageForCv) {
		this.foreignLanguageForCvDao.save(null);
		return new SuccessResult("updated");
	}

	@Override
	public Result delete(int id) {
		this.foreignLanguageForCvDao.deleteById(id);
		return new SuccessResult("deleted");
	}

	@Override
	public DataResult<List<ForeignLanguageForCv>> getAll() {
		
		return new SuccessDataResult<List<ForeignLanguageForCv>>(this.foreignLanguageForCvDao.findAll());
	}

	@Override
	public DataResult<ForeignLanguageForCv> getById(int id) {
		return new SuccessDataResult<ForeignLanguageForCv>(this.foreignLanguageForCvDao.getById(id));
	}

//	@Override
//	public DataResult<List<ForeignLanguageForCv>> getAllByCVId(int id) {
//		return new SuccessDataResult<List<ForeignLanguageForCv>>(this.foreignLanguageForCvDao.getAllByCV_id(id));
//
//	}

}
