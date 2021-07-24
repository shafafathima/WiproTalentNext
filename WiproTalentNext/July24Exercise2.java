package WiproTalentNext;

public class July24Exercise2 {

	public static void main(String[] args) {
		String str="3579";
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
		
		int dif1= ch[0]-ch[1];
		int dif2= ch[1]-ch[2];
		
	if(dif1==dif2)
	{
		System.out.println("Invalid Pin");
	}
	else
	{
		System.out.println("Valid");
	}
	}

}
