package io.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.JobSeekerService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.JobSeekerDao;
import io.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	
	private JobSeekerDao jobSeekerDao;
	

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "JobSekeer has been listed") ;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		
		return new SuccessResult("saved to DB");
	}

//	@Override
//	public Result delete(JobSeeker jobSeeker) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Result update(JobSeeker jobSeeker) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public DataResult<JobSeeker> getByDateOfBirth(LocalDate dateOfBirth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobSeeker> getByNationalId(String nationalId) {
		
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findJobSeekerByNationalId(nationalId));
	}

}
