package WiproTalentNext;

import java.util.Arrays;

public class August5Exercise3 {

	public static void main(String[] args) {
		String input="1029384756";
		char tempArray[] = input.toCharArray();
        Arrays.sort(tempArray);
        for(int i=0; i<tempArray.length;i++)
        {
        	System.out.print(tempArray[i]);
        }
        System.out.println("");
        for(int i=tempArray.length-1; i>=0;i--)
        {
        	System.out.print(tempArray[i]);
        }
        

	}

}
