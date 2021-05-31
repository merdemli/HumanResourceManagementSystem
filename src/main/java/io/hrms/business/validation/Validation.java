//package io.hrms.business.validation;
//
//public class Validation implements ValidationService {
//
//	private ValidationRules validationRules;
//
//	public Validation() {
//
//		validationRules = new ValidationRules();
//	}
//
//	public boolean isValidFirstName(String name) {
//
//		if (validationRules.isContainCharacter(name))
//			return false;
//		System.out.println(" your name should only consist of letters");
//		if (name.isBlank() || name == null)
//			return false;
//		System.out.println("name field cannot be left blank");
//
//		return true;
//	}
//
//	public boolean isValidLastName(String lastName) {
//
//		if (validationRules.isContainCharacter(lastName))
//			return false;
//		System.out.println(" your name should only consist of letters");
//		if (lastName.isBlank() || lastName == null)
//			return false;
//		System.out.println("name field  not be left blank");
//
//		return true;
//	}
//
//	public boolean isValidEmail(String email, String website) {
//
//		String mailDomain = email.split("@")[1];
//		if (mailDomain.equals(website))
//			return true;
//
//		if (!validationRules.isValidForm(email, "([a-zA-Z0-9])+\\@([a-zA-Z0-9])+\\.[a-zA-Z]{2,}"))
//
//			return false;
//		System.out.println("Plese check your email format");
//
//		if (email.isBlank() || email == null)
//
//		{
//			System.out.println("email field not be left blank");
//			return false;
//
//		}
//
//		return true;
//
//	}
//
//	public boolean isValidNationalId(String nationalId) {
//
//		if (nationalId.isBlank() || nationalId == null) {
//			System.out.println("national is field is not be left blank");
//			return false;
//		}
//
//		if (nationalId.length() != 11) {
//			System.out.println("national is field is not be left blank");
//			return false;
//		}
//		;
//		return true;
//
//	}
//
//}












