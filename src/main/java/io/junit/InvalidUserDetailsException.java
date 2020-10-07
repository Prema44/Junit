package io.junit;

public class InvalidUserDetailsException extends Exception{
	
	enum invalidCredentials{
		invalidFirstName,invalidLastName,invalidEmail,invalidMobileNumber,invalidPassword;
	}
	public invalidCredentials type;
	public InvalidUserDetailsException(invalidCredentials type, String message) {
		super(message);
		this.type = type;
	}


}
