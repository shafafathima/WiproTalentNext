package WiproTalentNext;
public class July13Exercise1 {
	
	public static void main (String[] args){
		    String str="I LOVE INDIA";
		    int count[] = new int[256];
		    int len = str.length();
		       for (int i = 0; i < len; i++)
		        {
		            count[str.charAt(i)]++;
		        }
		        char ch[] = new char[str.length()];
		        for (int k = 0; k < len; k++) {
		            ch[k] = str.charAt(k);
		            int find = 0;
		            for (int j = 0; j <= k; j++) 
		            {
		                if (str.charAt(k) == ch[j])
		                    find++;
		            }
		            if (find==1)
		                System.out.println(
		                    "Number of "
		                    + str.charAt(k)
		                    + " is:" + count[str.charAt(k)]);
		        }
		    }    
	}
