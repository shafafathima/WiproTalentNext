package WiproTalentNext;
public class July8Exercise1 {

	public static void main(String[] args) {
		  int c, num1 = 0, num2 = 1;
	        c = 11;
	        System.out.print("Fibonacci Series for "+c+" numbers:");
	        int i=1;
	        while(i<=c)
	        {
	            System.out.print(num1+" ");
	            int sum = num1 + num2;
	            num1 = num2;
	            num2 = sum;
	            i++;
	        }
		
	}

}
