package WiproTalentNext;

public class July12Exercise2 {
	
	public static int findlength(String x)
	{	
		return x.length();
	}

	public static void main(String[] args) {
		int sum1=0, sum2=0, sum3=0;
		int a,b;
		int numbers[] = new int[] {1,2,3,4,5,6,7,8,9};
		String s="jamal mohamed";
		String words[]=s.split("\\s");
		a=findlength(words[0]);
		b=findlength(words[1]);
		for(int i=0; i<a;i++)
		{
			sum1=sum1+numbers[i];
		}
		for(int j=0; j<b;j++)
		{
			sum2=sum2+numbers[j];
		}
		sum3=sum1+sum2;
		System.out.println(sum1+"+"+sum2+"="+sum3);
	}
}