package io.hrms.core.utilities.adapters.imageUpload;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import io.hrms.core.utilities.results.DataResult;

public interface CloudinaryService {
	
	DataResult<Map> uploadImageFile(MultipartFile imageFile);

}
