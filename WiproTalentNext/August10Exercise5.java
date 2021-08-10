package WiproTalentNext;

public class August10Exercise5 {

	public static void main(String[] args) {
		int [] numbers=new int[] {30,45,21,36,80};
		System.out.println("The even numbers in the array are:");
		for(int i=0; i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.print(numbers[i]+", ");
			}
			
		}

	}

}
