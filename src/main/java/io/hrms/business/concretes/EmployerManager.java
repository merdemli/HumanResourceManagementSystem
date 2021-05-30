package io.hrms.business.concretes;

import java.util.List;

import io.hrms.business.abstracts.EmployerService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.dataAccess.abstracts.EmployerDao;
import io.hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	

	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), 
				"Employer has been listed");
	}

	@Override
	public DataResult<Employer> getByCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

}
