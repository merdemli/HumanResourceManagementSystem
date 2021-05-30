package io.hrms.business.concretes;

import java.util.List;

import io.hrms.business.abstracts.UserService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.UserDao;
import io.hrms.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"users has been successfully listed");
		
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("user has been successfully added");
	}
    @Override
	public Result update(User user) {
		this.userDao.save(user);
		return new SuccessResult("user has been successfully updated");
		

	}

	@Override
	public Result delete(User user) {
		this.userDao.delete(user);
		return new SuccessResult("users has been successfully deleted");
	}

	@Override
	public DataResult<User> getById(int id) {
		
		return new SuccessDataResult<User>(this.userDao.getOne(id));
	}

	
}
