package WiproTalentNext;
public class July12Exercise1 {
	public static int toarrayhighest(int x)
	{
		String temp = Integer.toString(x);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) 
		{
		    numbers[i] = temp.charAt(i) - '0';
		}
		int n;  
		for (int i = 0; i < temp.length(); i++)   
		        {  
		            for (int j = i + 1; j <temp.length(); j++)   
		            {  
		                if (numbers[i] > numbers[j])   
		                {  
		                    n = numbers[i];  
		                    numbers[i] = numbers[j];  
		                    numbers[j] = n;  
		                }  
		            }  
		        }  
		       return numbers[temp.length()-1];  
		} 
	public static int toarraylowest(int x)
	{
		String temp = Integer.toString(x);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) 
		{
		    numbers[i] = temp.charAt(i) - '0';
		}
		int n;  
		for (int i = 0; i < temp.length(); i++)   
		        {  
		            for (int j = i + 1; j <temp.length(); j++)   
		            {  
		                if (numbers[i] > numbers[j])   
		                {  
		                    n = numbers[i];  
		                    numbers[i] = numbers[j];  
		                    numbers[j] = n;  
		                }  
		            }  
		        }  
		       return numbers[0];  
		} 
	
	public static void main(String[] args) {
		int a,b,c,d;
	
		a=8430;
		b=7320;
		c=5319;
		d=6041;
		a=toarrayhighest(a);
		b=toarraylowest(b);
		c=toarraylowest(c);
		d=toarrayhighest(d);
		int[] output = new int[] {a,b,c,d};
		System.out.print("The OTP is: ");
		for(int i=0; i<4;i++)
		{
			System.out.print(output[i]);
		}
	}
}
