package WiproTalentNext;
import java.util.*;
public class Sample {
	
	public static int sum(int x)
	{
		int r, total=0;
		while (x >0)
		{
			r = x % 10;
			total = total + r;
			x = x / 10;
		}
		return(total);
	}

	public static void main(String[] args) 
	{
		int FinalAnswer,count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your string");
		String input1 = sc.nextLine();
		for (int i=0; i<input1.length(); i++) 
		{
			if(input1.charAt(i) !=' ')
				count++;
		}
		FinalAnswer=sum(count);
		System.out.println("The single digit numeric pin is : " + FinalAnswer);
	}

}

