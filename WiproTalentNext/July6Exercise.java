package WiproTalentNext;

public class July6Exercise {
	
	public static int FinalAnswer (int x, int n) 
	{
		int q, z, sum = 0;
		z = x;
		for (int i =0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				q = x % 10;
				sum = sum + q;
				x = x / 10;	
			}
			z = z / 10;
			x=z;
		}
		return(sum);
	}
	
	public static void main(String[] args)
	{
		int r, a, reverse = 0, total = 0, y = 0;
		a=5432;
		while (a > 0)
		{
			r = a % 10;
			y++; // count for number of digits
			reverse = (reverse*10) + r;
			a = a / 10;
		}
		total = FinalAnswer(reverse,y);
		System.out.println("The Total is " + total);
		
}
}