package WiproTalentNext;
public class July8Exercise2 {

	public static void main(String[] args) {
		int i,j,c=0;
		System.out.println("prime number between 1 to 100 are");
		for(i=2;i<=100;i++)
		{
		for(j=1;j<=i;j++)
		{
		if(i%j==0)
		c++;
		}
		if(c==2)
		System.out.print(" "+i);
		c=0; 
		}
	}
}