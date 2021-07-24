package WiproTalentNext;
public class July24Exercise1 {
	public class PasswordValidator {
	 public static boolean isValid(String password)
	    { 
		 if (!((password.length() >= 8) && (password.length() <= 13))) {
	            return false;
	        }
	   
	        if (!(password.contains("@") || password.contains("#") || password.contains("$") || password.contains("*")|| password.contains("&")))
	               {
	            return false;
	        }
	  
	        if (true) {
	            int count = 0;
	            for (int i = 65; i <= 90; i++) {
	            	char c = (char)i;
	                String str1 = Character.toString(c);
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                return false;
	            }
	        }
	  
	        if (true) {
	            int count = 0;
	            for (int i = 90; i <= 122; i++) {
	            	char c = (char)i;
	                String str1 = Character.toString(c);
	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                return false;
	            }
	        }
	  return true;
	    }

	public static void main(String[] args) {

        String password1 = "Jamal#123";
  
        if (isValid(password1)) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
  
    }

	}

}
