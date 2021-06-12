package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.WorkExperienceForCvService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.WorkExperienceForCVDao;
import io.hrms.entities.concretes.JobSeeker;
import io.hrms.entities.concretes.WorkExperienceForCV;
import io.hrms.entities.dtos.WorkExperienceWithCvWithJobSeekerDto;


@Service
public class WorkExperienceForCvManager implements WorkExperienceForCvService {
	
	private WorkExperienceForCVDao workExperienceForCVDao;

	@Autowired
	public WorkExperienceForCvManager(WorkExperienceForCVDao workExperienceForCVDao) {
		super();
		this.workExperienceForCVDao = workExperienceForCVDao;
	}
	
	@Override
	public Result add(WorkExperienceForCV workExperinceForCV) {
		this.workExperienceForCVDao.save(workExperinceForCV);
		return new SuccessResult("It has been successfully added");
	}

	@Override
	public Result update(WorkExperienceForCV workExperinceForCV) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<WorkExperienceForCV>> getAll() {
		
		return new SuccessDataResult<List<WorkExperienceForCV>>(this.workExperienceForCVDao.findAll());
	}

	@Override
	public DataResult<WorkExperienceForCV> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DataResult<List<WorkExperienceWithCvWithJobSeekerDto>> getWorkExperienceWitCvWithJobSeekerDto(int userId) {
		
		return new SuccessDataResult<List<WorkExperienceWithCvWithJobSeekerDto>>(this.workExperienceForCVDao.getWorkExperienceWithCvWithJobSeekerDetails(userId));
	}

	
}
