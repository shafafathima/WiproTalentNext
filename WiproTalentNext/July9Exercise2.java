package WiproTalentNext;
public class July9Exercise2 {
	public static boolean Palindrome(String s){  
	    StringBuilder sb=new StringBuilder(s);  
	    sb.reverse();  
	    String rev=sb.toString();  
	    if(s.equals(rev)){  
	        return true;   }
	    else{  
	        return false;   }  
	}  
		public static String StringHandling(String s){  
		    String words[]=s.split("\\s");  
		    String reverse="";  
		    for(String w:words)
		    {  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverse+=sb.toString()+" ";  
		    }  
		    return reverse;  
		}  
	public static void main(String[] args) {
		String s="Jamal Mohamed";
		String output1;
		boolean output2;
		output1=StringHandling(s);
		output2=Palindrome(s);
		System.out.println(output1);   
		if(output2==true) {
		System.out.println("The given string is palindrome");
}
		else {
			System.out.println("The given string is not palindrome");
		}
}
}
