package WiproTalentNext;

public class July13Exercise3 {

	public static void main(String[] args) {
		String str = "Jamal Mohamed College Trichy";
		str.replaceAll("\\s","");
        int upper = 0, lower = 0;
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
                upper++;
            }
            else
            {
            	lower++;
            }
        }
 
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);

	}

}
