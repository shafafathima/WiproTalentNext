package WiproTalentNext;
public class August5Exercise4 {
	public static void main(String[] args) {
		int k=0;
		String str = "Jamal Mohamed College. Trichy, Tamil Nadu";
		String Array[] = str.split(" ");
		String temp="";
		while(k<Array.length)
		{
		for(int i=k; i<k+2;i++)
		{
			for(int j=i+1;j<k+2;j++)
			{
				temp=Array[i];
				Array[i]=Array[j];
				Array[j]=temp;
				System.out.println(Array[i]+" "+Array[j]);
			}			
		}
		k=k+2;
	}
	}
}
		
