package io.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	public void givenEntry_whenAllDataIsValid_thenReturnHappyMood() {
		UserRegistration obj = new UserRegistration();
		String name = obj.validateInput("Bridgelabz");
		String email = obj.validateEmail("abc@gmail.com");
		String number = obj.validateNumber("91 7738454018");
		String password = obj.validatePassword("Bridgelabz99@");		
		assertTrue(name.equals("valid") && email.equals("valid") && number.equals("valid") && password.equals("valid"),"Sad");
		System.out.println("Happy Mood");
	}
	
	@Test
	public void givenEntry_whenAnyDataIsInvalid_thenReturnSadMood() {
		UserRegistration obj = new UserRegistration();
		String name = obj.validateInput("Bridgelabz");
		String email = obj.validateEmail("abc.xyz@bl.co.in");
		String number = obj.validateNumber("91 7738454018");
		String password = obj.validatePassword("Bridgelabz99@");
		assertTrue(name.equals("invalid") || email.equals("invalid") || number.equals("invalid") || password.equals("invalid"),"Happy");
		System.out.println("Sad Mood");
	}
		
	}
		

