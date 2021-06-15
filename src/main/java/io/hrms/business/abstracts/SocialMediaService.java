package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.SocialMedia;

public interface SocialMediaService {
	Result add(SocialMedia socialMedia);
	DataResult<List<SocialMedia>>getAll();

}
