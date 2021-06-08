package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.entities.concretes.CV;

public interface CVService {
	DataResult<List<CV>>getByJobSeekerId(int userId );

}
