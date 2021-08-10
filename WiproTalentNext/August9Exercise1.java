package WiproTalentNext;

public class August9Exercise1 {

	public static void main(String[] args) {
		String str = "1029384756";
	      System.out.println("Entered list of numbers:" + str);
	      int j = 0;
	      char temp = 0;
	      char[] chars = str.toCharArray();
	      for(int i=0; i < chars.length; i++) {
	         for(j=0; j < chars.length; j++) {
	            if(chars[j] > chars[i]) {
	               temp = chars[i];
	               chars[i] = chars[j];
	               chars[j] = temp;
	            }
	         }
	      }
	      System.out.print("Second Largest number:");
	         System.out.print(chars[chars.length-2]);
	     

	}

}
