package io.junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class UserRegistration {
		public String validateInput(String name) {
			String expression = "(^[A-Z]{1})[a-z]{2,}$"; // Pattern for Names
			Pattern pattern = Pattern.compile(expression);
			Matcher match = pattern.matcher(name);
			if(match.find()) {
				return "valid";
			}
			return "invalid";
		}
		public String validateEmail(String Email) {
			String expression = "(abc?[.][A-Za-z]*@bl[.]co[.][A-Za-z]{2,})$"; // Pattern for Email
			Pattern pattern = Pattern.compile(expression);
			Matcher match = pattern.matcher(Email);
			if(match.find()) {
				return "valid";
			}
			return "invalid";
		}
		public String validateNumber(String number) {
			String expression = "^[0-9]{2}?[ ][0-9]{4,13}";	// Pattern for Number
			Pattern pattern = Pattern.compile(expression);
			Matcher match = pattern.matcher(number);
			if(match.find()) {
				return "valid";
			}
			return "invalid";
			
		}
		public String validatePassword(String pass) {
			String expression = "(?=.*[A-Z])(?=.*\\d)((?=.*[@$!%*?&]){1})[A-Za-z0-9]{8,}";	//Pattern for Password
			Pattern pattern = Pattern.compile(expression);
			Matcher match = pattern.matcher(pass);
			if(match.find()) {
				return "valid";
			}
			return "invalid";
			
		}
		
	}


