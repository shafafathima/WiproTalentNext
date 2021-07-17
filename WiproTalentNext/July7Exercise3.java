package WiproTalentNext;

public class July7Exercise3 {

	public static void main(String[] args) {
		 int a = 598745320;
	        int even = 0;
	        int odd = 0;
	        while (a > 0)
	        {
	            if ((a % 10) % 2 == 0)
	                even = even + a % 10;
	            else
	                odd = odd + a % 10;
	            a = a / 10;
	        }
	        System.out.print("Even : " + even + "\n" + "Odd : " + odd);

	}

}
