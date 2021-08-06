package WiproTalentNext;
import java.util.Arrays;
public class August5Exercise2 {

	public static void main(String[] args) {
		String input="qwertyuiopasdfghjklzxcvbnm";
		char tempArray[] = input.toCharArray();
        Arrays.sort(tempArray);
        for(int i=0; i<tempArray.length;i++)
        {
        	System.out.print(tempArray[i]);
        }
	}

}
