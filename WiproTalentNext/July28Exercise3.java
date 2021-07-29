package WiproTalentNext;

public class July28Exercise3 {

	public static void main(String[] args) {
		  String str = "abcdefghijklmnopqrstuvwxy"; 
		  int len = str.length();
		  int n = 5;  
	      int temp = 0, chars = len/n; 
	      String[] Str1 = new String [n];  
	            for(int i = 0; i < len; i = i+chars) {
	            	String part = str.substring(i, i+chars);  
	                Str1[temp] = part;  
	                temp++;  
	             
	    System.out.println(n + " equal parts of given string are ");  
	            for(int j = 0; j < Str1.length; j++) {  
	                System.out.println(Str1[j]);  
	                }  
	            }  

	}

}
