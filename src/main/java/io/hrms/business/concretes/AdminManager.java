package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.AdminService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.dataAccess.abstracts.AdminDao;
import io.hrms.entities.concretes.Admin;

@Service
public class AdminManager implements AdminService{
	
	private AdminDao adminDao;
	

	@Autowired
	public AdminManager(AdminDao adminDao) {
		super();
		this.adminDao = adminDao;
	}

	@Override
	public Result add(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Result delete(Admin admin) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Result update(Admin admin) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public DataResult<List<Admin>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Admin> getByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
