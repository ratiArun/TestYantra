package programmes;

public class Prog14 {

	public static void main(String[] args)
	{
		int[] a= {10,30,90,50,20};
		int n=a.length;
		int temp;
		for(int i=1;i<n;i++)
		{
			if(a[i]!=0)
			{
				for(int j=0;j<n-i;j++)
				{
					if(a[j]<a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			
		}
		
		System.out.println(a[2]);

	}

}
