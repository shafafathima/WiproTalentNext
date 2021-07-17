package WiproTalentNext;

public class July15Exercise4 {
	public static void main(String[] args) {
		String a="jamal mohamed college";
		String capital="";  
				System.out.println("UpperCase: "+a.toUpperCase());
				System.out.println("LowerCase: "+a.toLowerCase());
				
				
				 char[] ch = a.toCharArray();
			      for(int i=0; i<ch.length; i=i+2){
			         ch[i] = Character.toUpperCase(ch[i]);
			      }
			      System.out.println(new String(ch));
			      
			     String words[]=a.split(" ");
				 for(String w:words){  
				        String first=w.substring(0,1);  
				        String afterfirst=w.substring(1);  
				        capital+=first.toUpperCase()+afterfirst+" "; 
				 }
				 System.out.println(capital);
	}

}
