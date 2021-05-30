package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Admin;

public interface AdminService {

	Result add(Admin admin);

	Result delete(Admin admin);

	Result update(Admin admin);

	DataResult<List<Admin>> getAll();

	DataResult<Admin> getByid(int id);

}
