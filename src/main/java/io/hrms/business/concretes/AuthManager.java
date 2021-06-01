package io.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.AdminService;
import io.hrms.business.abstracts.AuthService;
import io.hrms.business.abstracts.EmployerService;
import io.hrms.business.abstracts.JobSeekerService;
import io.hrms.business.abstracts.UserService;
import io.hrms.core.utilities.adapters.ValidatePersonService;
import io.hrms.core.utilities.results.ErrorDataResult;
import io.hrms.core.utilities.results.ErrorResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessResult;
import io.hrms.entities.concretes.Employer;
import io.hrms.entities.concretes.JobSeeker;

@Service
public class AuthManager implements AuthService {
	
	
	private UserService userService;
	private EmployerService employerService;
	private AdminService adminService;
	private JobSeekerService jobSeekerService;
	private ValidatePersonService validatePersonService;

	@Autowired
	public AuthManager( UserService userService, EmployerService employerService, AdminService adminService,
			JobSeekerService jobSeekerService, ValidatePersonService validatePersonService) {
		super();
		
		this.userService = userService;
		this.employerService = employerService;
		this.adminService = adminService;
		this.jobSeekerService = jobSeekerService;
		this.validatePersonService = validatePersonService;
	}

	
	@Override
	public Result registerForEmployer(Employer employer, String password) {

		if (!checkIfNullInfoForEmployer(employer)) {

			return new ErrorResult("You have entered missing information. Please fill in all fields.");
		}

		if (!checkEmailAndDomain(employer.getEmail(), employer.getWebsite())) {

			return new ErrorResult("Invalid email address.");
		}

		if (!checkIfEmailExists(employer.getEmail())) {

			return new ErrorResult(employer.getEmail() + " already exists.");
		}

		if (!checkIfConfirmPassword(employer.getPassword(), password)) {

			return new ErrorResult("Passwords do not match.");
		}

		this.employerService.add(employer);
		
		return new SuccessResult("Registration has been successfully completed");

	}

	
	
	
	
	@Override
	public Result registerForJobSeeker(JobSeeker jobSeeker, String password) {
		
		if(!CheckIfMernisPerson(jobSeeker))
		{return new ErrorResult("not verified by the mernis system");}
		
		
		
		if(!checkIfExistNationalId(jobSeeker.getNationalId())) {
			
			return new ErrorResult("This nationalId is already Exist");
		}
		
		if(!checkIfEmailExists(jobSeeker.getEmail())) {
			
			return new ErrorResult("email adress is already used");
		}
		
		if(!checkIfNullInfoForJobSeeker(jobSeeker, password)) {
			
			return new ErrorResult("You have entered missing information. Please fill in all fields");
		}
		
		
			
			this.jobSeekerService.add(jobSeeker);

		return new SuccessResult("Registration has been successfully completed");
	}
	
	
	
	
	//Validation for jobSeeker Register
	
	private boolean checkIfNullInfoForJobSeeker(JobSeeker jobSeeker, String password) {
		
		if(jobSeeker.getFirstName() != null && jobSeeker.getLastName()!=null
				&& jobSeeker.getNationalId() !=null &&jobSeeker.getPassword() !=null && jobSeeker.getDateOfBirth() != null 
				&& jobSeeker.getEmail() !=null) {return true;}
		return true;
	}
	
	private boolean checkIfExistNationalId(String nationalId) {
		
		if(jobSeekerService.getByNationalId(nationalId).getData() == null) return true;
		else return false;
	}
	
	
	private boolean CheckIfMernisPerson(JobSeeker jobSeeker) {
		
		if(validatePersonService.CheckIfRealPerson(jobSeeker)) {
			return true;
		}
		else return false;
		
	}
	
	//Common Validation
	
	private boolean checkIfEmailExists(String email) {
		
		if(this.userService.findByEmail(email).getData()==null) return true;
		else return false;
	}
	
	private boolean checkIfConfirmPassword(String password, String confirmPassword) {
		
		if(password.equals(confirmPassword)) return true;
		else return false;
	}
	
	//Validate for  employer
	
	private boolean checkEmailAndDomain(String email, String website) {
		String mailDomain = email.split("@")[1];
		if (mailDomain.equals(website))return true;
		else return false;
			

	}
	
	private boolean checkIfNullInfoForEmployer(Employer employer) {

		if (employer.getCompanyName() != null && employer.getWebsite() != null && employer.getEmail() != null
				&& employer.getPhoneNumber() != null && employer.getPassword() != null) {

			return true;

		}

		return false;
	}
	
	
		

}
