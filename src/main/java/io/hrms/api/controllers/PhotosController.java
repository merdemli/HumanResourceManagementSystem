package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.CVService;
import io.hrms.business.abstracts.PhotoService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.CV;
import io.hrms.entities.concretes.ForeignLanguageForCv;
import io.hrms.entities.concretes.Photo;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/api/photos")
public class PhotosController {
	
	private PhotoService photoService;
	private CVService cvService;

	
	
	public PhotosController(PhotoService photoService, CVService cvService) {
		super();
		this.photoService = photoService;
		this.cvService = cvService;
	}

	@PostMapping(value = "/add")
	Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile) {
		
		CV cv = this.cvService.getById(id).getData();
		Photo photo = new Photo();
		photo.setCv(cv);
		return this.photoService.add(photo,imageFile);
	}
	
	
	@GetMapping("/getAll")
	DataResult<List<Photo>>getAll(){
		return this.photoService.getAll();}
	
	
	
	

		
}
