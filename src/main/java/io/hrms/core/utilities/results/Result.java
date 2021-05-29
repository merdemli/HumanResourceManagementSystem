package io.hrms.core.utilities.results;

public class Result {
	private boolean success;
	private String message;

	public Result(boolean success) {
		this.success = success;
	}

	public Result(boolean success, String message) {
		
		this(success);                    //this.success = success;
		this.message = message;
		
	}
	
	public boolean isSuccess() { //getSuccess
		return this.success;
	} 

	public String getMassage() {
		return this.message; 
	}
}
