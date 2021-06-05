package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.City;

public interface CityService {
	Result add(City city);
//
//	Result update(City city);
//
//	Result delete(City city);
//
	DataResult<List<City>> getAll();
//
//	DataResult<City>getById(int id);
	



}
