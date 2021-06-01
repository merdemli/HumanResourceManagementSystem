package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll();

	DataResult<Employer> getByCompanyName(String companyName);

	Result add(Employer employer);

//	Result delete(Employer employer);
//
//	Result update(Employer employer);

}
