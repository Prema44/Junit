package io.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest{
	UserRegistration user = new UserRegistration();
	@Test
	public void givenFirstName_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateFirstName("Abc"));
	}
	@Test
	public void givenLastName_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateLastName("Abc"));
	}
	@Test
	public void givenEmail_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateEmail("abc@gmail.com"));
	}
	@Test
	public void givenMobileNumber_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateMobileNumber("91 7738454018"));
	}
	@Test
	public void givenPassword_Valid_shouldReturnValid() {
		assertEquals("valid", user.validatePassword("Sakshat9@p"));
	}
	@Test
	public void givenFirstName_Invalid_shouldReturnInvalid() {
		assertEquals("invalidFirstName", user.validateFirstName("S"));
	}
	@Test
	public void givenLastName_Invalid_shouldReturnInvalid() {
		assertEquals("invalidLastName", user.validateLastName("Sh"));
	}
	@Test
	public void givenEmail_Invalid_shouldReturnInvalid() {
		assertEquals("invalidEmail", user.validateEmail("Sakshat"));
	}
	@Test
	public void givenMobileNumber_Invalid_shouldReturnInvalid() {
		assertEquals("invalidMobileNumber", user.validateMobileNumber("Sakshat"));
	}
	@Test
	public void givenPassword_Invalid_shouldReturnInvalid() {
		assertEquals("invalidPassword", user.validatePassword("Sakshat"));
	}

}
