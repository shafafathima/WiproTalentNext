package WiproTalentNext;
public class July28Exercise1 {

	public static void main(String[] args) {
        String str ="Jamal Mohamed College";
        str = str.toLowerCase();
        int len = str.length();
        String sortedStr = ""; 
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < len; i++) {
                char strCh = str.charAt(i);
                if (ch == strCh) {
                    sortedStr += strCh;
                }
            }
        }
        
        System.out.println("Output:");
        System.out.println(sortedStr);
	}

}
