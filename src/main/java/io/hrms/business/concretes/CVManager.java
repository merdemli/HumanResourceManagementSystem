package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.CVService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.SuccessDataResult;
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

}
