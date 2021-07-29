package WiproTalentNext;
public class July28Exercise2 {
	static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
    static void array(String str)
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
    static int firstNonRepeating(String str)
    {
        array(str);
        int i, index = -1;
 
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        } 
        return index;
    }
	public static void main(String[] args) {
		String str = "gibblegabbler";
        int index = firstNonRepeating(str);
         if(index == -1)
         {
        	 System.out.println("Either all characters are repeating or string is empty ");
         }
         else
         {
             System.out.println("First non-repeating character is "+ str.charAt(index));
         }
	}
}
