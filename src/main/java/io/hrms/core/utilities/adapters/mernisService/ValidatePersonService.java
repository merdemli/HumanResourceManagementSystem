package io.hrms.core.utilities.adapters.mernisService;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import io.hrms.entities.concretes.JobSeeker;


public interface ValidatePersonService {
	boolean CheckIfRealPerson(JobSeeker jobSeeker) ;

}
