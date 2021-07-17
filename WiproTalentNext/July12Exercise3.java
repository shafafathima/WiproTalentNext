package WiproTalentNext;

public class July12Exercise3 {

	public static void main(String[] args) {
		String a="Ja146mal 78Moh092amed";
		a = a.toLowerCase(); 
	      char[] charac = a.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      for(char c : charac){
	         if(Character.isDigit(c)){
	            sb.append(c);
	         }
	      }
	      System.out.println(sb);
	      for(int i=0;i<21;i++)
	      {
	    	  if(a.charAt(i) >= 'a' && a.charAt(i)<='z')
	    	  {
	    		  System.out.print(a.charAt(i));
	    	  }
	      }
	}

}
