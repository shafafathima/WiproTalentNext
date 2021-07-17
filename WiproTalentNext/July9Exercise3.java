package WiproTalentNext;

public class July9Exercise3 {

	public static void main(String[] args) {
		String a="Jamal Mohamed College.";
		int vowels=0, consonants=0, words=0, sentences=0, whitespace=0;
		a = a.toLowerCase(); 
		 for(int i = 0; i < a.length(); i++) {    
	              
	            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {    
	                    
	                vowels++;    
	            }    
	             
	            else if(a.charAt(i) >= 'a' && a.charAt(i)<='z') {      
	                    
	                consonants++;    
	            }    
	        }    
		 		System.out.println("No. Of vowels: "+vowels);
		 		System.out.println("No. Of consonants: "+consonants);
		 		for(int i = 0; i < a.length(); i++)
		 		{
		 			if(a.charAt(i)==' ')
		 			whitespace++;
		 		}
		 		System.out.println("No. Of Words: "+ ++whitespace);
		 		for(int i = 0; i < a.length(); i++)
		 		{
		 			if(a.charAt(i)=='.')
		 			sentences++;
		 		}
		 		System.out.println("No. Of Words: "+sentences);
	}
	

}
