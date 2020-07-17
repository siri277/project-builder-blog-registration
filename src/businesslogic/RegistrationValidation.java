package businesslogic;
public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(validPassword(password, confirmPassword)&&validEmail(email)) {
			return true;
		}
		else {
			return false;
		}
	}
	private boolean validPassword(String password, String confirmPassword) {
		String pass="((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{8,20})";
		 if(password==null) {
			 return false;
		 }
		 else if(password.matches(pass)) {
			 if(password.equals(confirmPassword)) {
				 return true;
			 }
			 else {
				 return false;
			 }
		 }
		 else 
			 return false;

	}
	private boolean validEmail(String email) {
		String emailpass = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$";
		if(email==null) {
			return false;
		}
		else if(email.matches(emailpass)) {
			return true;
		}
		else
			return false;
	}


}
