package WiproTalentNext;

public class July19Exercise1 {

	public static void main(String[] args) {
		int big,small,i;
		int a[] = new int[]{80,60,70,10,40,90,50};
		int n = a.length;
		big=small=a[0];
		for(i=1;i<n;++i)
		{
		if(a[i]>big)
		big=a[i];

		if(a[i]<small)
		small=a[i];
		}

		System.out.println("The biggest element is " + small );
		System.out.println("The smallest element is " + big );

	}

}
