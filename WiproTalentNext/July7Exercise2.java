package WiproTalentNext;

public class July7Exercise2 {
	
	public static int SumOfSum(int x)
	{
		int q, finalsum = 0;
		while (x > 0) 
		{
			q = x % 10;
			finalsum = finalsum + q;
			x = x / 10;
		}
		return(finalsum);
	}

	public static void main(String[] args) {
		int a, r, sum = 0, total =0, output= 0;
		a = 23658;
		while (a > 0)
		{
			r = a % 10;
			sum = sum + r;
			a = a / 10;
		}
		total = SumOfSum(sum);
		output = sum + total;
		System.out.println("The Final Sum Is : " + output);
	}

}
