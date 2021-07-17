package WiproTalentNext;
import java.lang.Math;
public class July7Exercise1 {
	public static int reverse(int a)
	{
		int q, reverse = 0;
		while (a > 0)
		{
			q = a % 10;
			reverse = (reverse*10) + q;
			a = a / 10;
		}
		return(reverse);
	}
		

	public static void main(String[] args) {
		int b, r, i, n=0;
		double p=10;
		b = reverse(65214);
		while (b >0)
		{
			r = b % 10;
			n++;
			for(i=0; i<1; i++)
			{
				p= Math.pow(10, 5-n);
				System.out.println(r*p);
			}
			i=0;
			b = b / 10;
		}

	}

}
