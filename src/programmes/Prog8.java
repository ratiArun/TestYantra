package programmes;

public class Prog8 {

	public static void main(String[] args)
	{
		int[] a= {30,90,50,70};
		int n=a.length;
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(a[0]);

	}

}
