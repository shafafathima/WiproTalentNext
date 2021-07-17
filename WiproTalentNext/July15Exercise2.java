package WiproTalentNext;

public class July15Exercise2 {
	
	static int ncr(int n, int r)   
    {   
          return fact(n) / (fact(r) * fact(n - r));   
    }   
	
	static int fact(int n)   
    {   
          int r = 1;   
          for (int i = 2; i <= n; i++)   
          r = r* i;   
          return r;   
    } 

	public static void main(String[] args) {
		int n=5,r=3;  
	       if(n>=r)
		   {
	            System.out.println("Value of "+ n+"C"+r+"= "+ncr(n, r)); 
		   }
	       else
	 		  System.out.println("n value should be greater than or equals to r value");
}

}
