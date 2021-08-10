package WiproTalentNext;
public class August9Exercise2 {
	
	public static int[] sort(int array[])
	{ int temp,j,i;
		for( i=0; i < array.length; i++) {
	         for(j=0; j < array.length; j++) {
	            if(array[j] > array[i]) {
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;	               
	            }
	         }
	      }
		return array;
	}

	public static void main(String[] args) {
		int count=0;
		int [] arrayone=new int[] {4,5,1,3,2};
		int [] arraytwo=new int[] {5,3,2,4,1};
		int n = arrayone.length;
        int m = arraytwo.length;
        if (n != m)
        {
        	System.out.println("Array elements not equal");
        }
        else
        {
		arrayone=sort(arrayone);
		arraytwo=sort(arraytwo);
		for (int i = 0; i < n; i++)
            if (arrayone[i] != arraytwo[i])
            {
            	count++;
            }
           if(count>0)
           {
        	   System.out.println("Elements are not same");
           }
           else
           {
        	   System.out.println("Elements are same");
           }
        }		
		                         	
	}	

}
