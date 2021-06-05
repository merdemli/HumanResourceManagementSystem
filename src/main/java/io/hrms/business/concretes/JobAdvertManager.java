package io.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.JobAdvertService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.ErrorDataResult;
import io.hrms.core.utilities.results.ErrorResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.JobAdvertDao;
import io.hrms.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {
	
	private JobAdvertDao jobAdvertDao;

	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}
	
	

	@Override
	public Result add(JobAdvert jobAdvert) {
		if (checkIfNotNullField(jobAdvert)) {
			jobAdvert.setCreatedAt(LocalDate.now());
			this.jobAdvertDao.save(jobAdvert);
			return new SuccessResult("Job Advert added");
		}else
		return new ErrorResult("JobAdvert saved to DB");
	}
	

	@Override
	public Result update(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("JobAdvert has been updated");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertDao.deleteById(id);
		return new SuccessResult("JobAdvert deleted");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByJobAdvertStatusList() {

		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllByAdvertStatusList(),
				"listed by status");
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {

		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(), "All JobAdvert Listed");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByCretedAtDesc() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllByCretedAtDesc(), "Listed by date");
	}

	@Override
	public DataResult<List<JobAdvert>> getByAdvertStatus(boolean advertStatus) {
		if (advertStatus == false) {
			return new ErrorDataResult<List<JobAdvert>>(null, "there is no active adverts");
		} else {
			return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getByAdvertStatus(advertStatus),
					"active adverts listed");
		}
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByEmployerOpenAdvert(int id) {

		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllByEmployerOpenAdvert(id),
				"aktif ilanlar listelendi,jpql");
	}

//	@Override
//	public DataResult<List<JobAdvert>> getByEmployer_userId(int userId) {
//
//		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getByEmployer_userId(userId),
//				"listed by employer Id,JPA");
//	}

	@Override
	public DataResult<JobAdvert> getById(int id) {

		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getById(id), "listed with id");
	}

	private boolean checkIfNotNullField(JobAdvert jobAdvert) {
		if (!jobAdvert.getDescription().isBlank() && jobAdvert.getJobPosition() != null && jobAdvert.getCity() != null
				&& jobAdvert.getOpenPositionCount() != 0) {
			return true;
		} else
			return false;
	}

	@Override
	public Result changeAdvertStatusClose(int id) {
		JobAdvert jobAdvertt = this.jobAdvertDao.getById(id);
		jobAdvertt.setAdvertStatus(false);
		update(jobAdvertt);
		return new SuccessResult ("Job Advert has been successfully closed");
		
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByDeadlineLessThanEqual(LocalDate date) {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllByDeadlineLessThanEqual(date), 
				"active adverts listed,lessthan");
	}
}
