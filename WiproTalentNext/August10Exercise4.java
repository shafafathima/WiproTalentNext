package WiproTalentNext;

public class August10Exercise4 {

	public static void main(String[] args) {
		int sum=0;
		int [] a=new int[] {30,45,21,36,80};
		int [] b=new int[] {22,43,98,17,37};
		for(int i=0; i<a.length;i++)
		{
			sum=a[i]+b[i];
			System.out.print(sum+", ");
			sum=0;
		}
		

	}

}
