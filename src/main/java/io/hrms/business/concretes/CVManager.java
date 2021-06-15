package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.CVService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.dataAccess.abstracts.CVDao;
import io.hrms.entities.concretes.CV;


@Service
public class CVManager implements CVService {
	
	
	private CVDao cvDao;
	
	@Autowired
	public CVManager(CVDao cvDao) {
		super();
		this.cvDao = cvDao;
	}



	@Override
	public DataResult<List<CV>> getByJobSeekerId(int userId) {
		
		return new SuccessDataResult<List<CV>>(this.cvDao.getByJobSeekerId(userId) , "geldi");
	}



	@Override
	public Result add(CV cv) {
		this.cvDao.save(cv);
		return new SuccessResult("cv added to system");
	}



	@Override
	public Result update(CV cv) {
		this.cvDao.save(cv);
		return new SuccessResult("cv added to system");
	}



	@Override
	public Result delete(int id) {
		this.cvDao.deleteById(id);
		return new SuccessResult("cv deleted to system");
	}



	@Override
	public DataResult<List<CV>> getAll() {
		
		return new SuccessDataResult<List<CV>>(this.cvDao.findAll(), "All CVs listed");
	}



	@Override
	public DataResult<CV> getById(int id) {
		
		return new SuccessDataResult<CV>(this.cvDao.getById(id));

	}
	
//	public DataResult<CVDto>getCVByJobSeekerId(int id){
//		
//		CVDto cv = new CVDto();
//		
//		
//		
//		
//	}

}
