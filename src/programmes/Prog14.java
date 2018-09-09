package programmes;

public class Prog14 {

	public static void main(String[] args)
	{
		int[] a= {10,30,90,50,20};
		int n=a.length;
		int first=0;
		int second=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]>second)
				second=a[i];
		}
		
		System.out.println(second);

	}

}
