package WiproTalentNext;

public class July8Exercise3 {
	public static void main(String[] args) {
		int[] myNum = {10, 30, 15, 50, 40, 20};
		int size = myNum.length;
		for(int i=0; i<size; i++)
			{
				if(myNum[i]==15)
				{
				System.out.println("The Location of the number is: "+ (i+1));
				}
			}
	}

}
