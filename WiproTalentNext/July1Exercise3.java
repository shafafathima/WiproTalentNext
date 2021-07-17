package WiproTalentNext;

public class July1Exercise3 {

	public static void main(String[] args) {
		String a="India is a country that boasts of a rich culture . It is big country . The culture of India refers to a collection of minor unique cultures . The culture of India comprises of clothing , festivals , languages , religions , music , dance , architecture , food , and art in India . Most noteworthy , Indian culture has been influenced by several foreign cultures throughout its history . Also , the history of India’s culture is several millennia old .";
		int  commas=0, whitespace=0, count=1, sentences=0;
		a = a.toLowerCase(); 
		String[] words=a.split(" ");
	      
	      for(int i=0;i<words.length;i++)       
	      {
	         for(int j=i+1;j<words.length;j++) 
	         {
	            
	         if(words[i].equals(words[j]))
	            {
	              count=count+1;    
	               words[j]="0"; 
	            }
	         }
	         if(words[i]!="0" && count>1)
	         System.out.println(words[i]+"--"+count); 
	         count=1;
	      }
		
		 
		 		for(int k = 0; k < a.length(); k++)
		 		{
		 			if(a.charAt(k)==' ')
		 			whitespace++;
		 		}
		 		System.out.println("No. Of Words: "+ ++whitespace);
		 		for(int l = 0; l < a.length(); l++)
		 		{
		 			if(a.charAt(l)==',')
		 			commas++;
		 		}
		 		System.out.println("No. Of Commas: "+commas);
		 		for(int m = 0; m < a.length(); m++)
		 		{
		 			if(a.charAt(m)=='.')
		 			sentences++;
		 		}
		 		System.out.println("No. Of Sentences: "+sentences);
	}
}
	



