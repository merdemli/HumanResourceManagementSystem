package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.PhotoService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.ForeignLanguageForCv;
import io.hrms.entities.concretes.Photo;


@RestController
@RequestMapping("/api/photos")
public class PhotosController {
	
	private PhotoService photoService;

	@Autowired
	public PhotosController(PhotoService photoService) {
		super();
		this.photoService = photoService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody Photo photo) {
		return this.photoService.add(photo);
	}
	
	@GetMapping("/getAll")
	DataResult<List<Photo>>getAll(){
		return this.photoService.getAll();}
	
	
	
	

		
}
