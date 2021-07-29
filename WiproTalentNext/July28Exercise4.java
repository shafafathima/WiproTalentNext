package WiproTalentNext;

public class July28Exercise4 {
	public static void main(String[] args) {
		String str = "rabbit";
	      char[] chSearch = {'b', 'i', 'b'};
	      for (int i = 0; i < str.length(); i++) {
	         char ch = str.charAt(i);
	         for (int j = 0; j < chSearch.length; j++) {
	            if (chSearch[j] == ch) {
	               System.out.println("Character "+chSearch[j]+" found in string "+str);
	            }
	         }
	      }
	}

}
