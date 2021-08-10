package WiproTalentNext;
import java.util.Scanner;
public class August9Exercise3 {

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the word to be found"); 
		String word=input.next();
		int count=0;
		 String str = "Welcome to  Java  Class";
		 String strArray[] = str.split(" ");
		 for(int i=0; i < strArray.length; i++){
			 if(strArray[i].equals(word)) {
				 count++;
			 }
			 
		 }
		 if(count>0)
		 {
			 System.out.println("The given word "+word+"  is present in the file");
		 }
		 else
		 {
			 System.out.println("The given word "+word+"  is not present in the file");
		 }
	     

	}

}
