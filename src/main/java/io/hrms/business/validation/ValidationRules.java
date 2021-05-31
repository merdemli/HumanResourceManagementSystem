//package io.hrms.business.validation;
//
//import java.util.regex.Pattern;
//
//public class ValidationRules implements BaseValidationRules {
//
//	@Override
//	public boolean isValidForm(String s, String requiredForm) {
//
//		if (Pattern.matches(requiredForm, s))
//			return true;
//		else
//			return false;
//	}
//
//	@Override
//	public boolean isContainDigit(String s) {
//
//		boolean result = false;
//
//		for (int i = 0; i < s.length(); i++) {
//			if (Character.isDigit(s.charAt(i))) {
//				result = true;
//				break;
//			}
//
//		}
//		return result;
//	}
//
//	@Override
//	public boolean isContainCharacter(String s) {
//		if (Pattern.matches("[a-zA-ZðÐçÇþÞüÜöÖýÝ]", s))
//			return true;
//
//		else
//			return false;
//	}
//
//}
