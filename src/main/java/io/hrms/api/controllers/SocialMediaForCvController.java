package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.SocialMediaForCVService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Photo;
import io.hrms.entities.concretes.SocialMediaForCV;

@RestController
@RequestMapping("/api/socialmediaforcv")
public class SocialMediaForCvController {
	
	private SocialMediaForCVService socialMediaForCVService;

	@Autowired
	public SocialMediaForCvController(SocialMediaForCVService socialMediaForCVService) {
		super();
		this.socialMediaForCVService = socialMediaForCVService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody SocialMediaForCV socialMediaForCv) {
		return this.socialMediaForCVService.add(socialMediaForCv);
	}
	
	@GetMapping("/getAll")
	DataResult<List<SocialMediaForCV>>getAll(){
		return this.socialMediaForCVService.getAll();
	
	}
}
