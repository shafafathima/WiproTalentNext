package WiproTalentNext;

public class August5Exercise1 {

	public static void main(String[] args) {
		String string = "Jamal Mohamed College, Trichy, Tamil nadu.";    
        int count = 0, count1=0;    
        for(int i = 0; i < string.length(); i++) {        
                count1++;    
        }     
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        System.out.println("Total number of characters in a string with spaces: " + count1);  
        System.out.println("Total number of characters in a string without spaces: " + count);   

	}

}
