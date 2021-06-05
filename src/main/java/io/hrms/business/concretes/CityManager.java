package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.CityService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.CityDao;
import io.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("City successfully added") ;
	}

//	@Override
//	public Result update(City city) {
//		this.cityDao.save(city);
//		
//		return new SuccessResult("City successfully updated");
//	}

//	@Override
//	public Result delete(City city) {
//		
//		return null;
//	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "All cities successfully listed");
		
	}

//	@Override
//	public DataResult<City> getById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
