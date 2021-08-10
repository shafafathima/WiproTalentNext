package WiproTalentNext;

public class August10Exercise3 {

	public static void main(String[] args) {
		String str="Jamal Mohamed College, Trichy, Tamil Nadu.";
		String Array[] = str.split(" ");
		for(int i=1;i<Array.length;)
		{
				System.out.println(Array[i]);
				i=i+2;	
		}
	}

}
