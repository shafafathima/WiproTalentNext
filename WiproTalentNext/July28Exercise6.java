package WiproTalentNext;
import java.util.Arrays;
public class July28Exercise6 {
	  static void removeDuplicate(char str[], int length)   
	    {  
		  int j,k = 0; 
	        for (int i = 0; i < length; i++)   
	        {      
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            }  
	            if (j == i)    
	            {   
	                str[k++] = str[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(str, k)));   
	    }   
	    

	public static void main(String[] args) {
		 String input = "Jamal Mohamed College"; 
	        char str[] = input.toCharArray();
	        int len = str.length;  
	        removeDuplicate(str, len);   

	}

}
