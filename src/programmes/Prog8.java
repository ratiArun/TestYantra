package programmes;

public class Prog8 {

	public static void main(String[] args)
	{
		int[] a= {30,90,50,70};
		int n=a.length;
		int high=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]>high)
			{
				high=a[i];
			}
			
		}
		System.out.println(high);

	}

}
