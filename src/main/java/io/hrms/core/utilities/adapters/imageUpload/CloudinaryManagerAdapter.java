package io.hrms.core.utilities.adapters.imageUpload;

import java.io.IOException;
import java.util.Map;


import org.springframework.web.multipart.MultipartFile;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.ErrorDataResult;
import io.hrms.core.utilities.results.SuccessDataResult;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;



public class CloudinaryManagerAdapter implements CloudinaryService {
	
	private Cloudinary cloudinary;
	
	public CloudinaryManagerAdapter() {

		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dayx2sam5",
				"api_key", "699443261618643",
				"api_secret", "LaC_8aO4_p-vseLXfpOJGuC-sjI"));
	}

	@Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		
			try {
				
				@SuppressWarnings("unchecked")
				Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
				return new SuccessDataResult<Map>(resultMap);
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			return new ErrorDataResult<Map>();
		}

		
		
		
	}

	
		
	
		
		
	

	
		
		
		
		
	

	


