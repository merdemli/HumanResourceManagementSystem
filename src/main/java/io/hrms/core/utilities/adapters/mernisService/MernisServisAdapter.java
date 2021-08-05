package io.hrms.core.utilities.adapters.mernisService;

import java.rmi.RemoteException;
import java.util.Locale;

import org.springframework.stereotype.Component;


import io.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisServisAdapter implements ValidatePersonService {

	@Override
	public boolean CheckIfRealPerson(JobSeeker jobSeeker)  {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		boolean result = false;

		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalId()),
					jobSeeker.getFirstName().toUpperCase(new Locale("tr")), jobSeeker.getLastName().toUpperCase(new Locale("tr")),
					jobSeeker.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return result;

	}

}
