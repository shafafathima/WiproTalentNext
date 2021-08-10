package WiproTalentNext;

public class August10Exercise1 {

	public static void main(String[] args) {
		int sum=0;
		int [] numbers=new int[] {30,45,21,36,80};
		for(int i=0; i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			{
				sum=sum+numbers[i];
			}
			
		}
		System.out.println("The sum of even numbers in array is:"+sum);

	}

}
