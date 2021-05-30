package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();

	DataResult<User> findByEmail(String email);

	Result add(User user);

	Result update(User user);

	Result delete(User user);

	DataResult<User> getById(int id);

}
