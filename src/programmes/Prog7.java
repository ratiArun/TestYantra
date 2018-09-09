package programmes;

public class Prog7 {

	public static void main(String[] args)
	{
		int[] a= {20,30,60,80};
		int n=a.length;
		int j=n-1;
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			b[j]=a[i];
			j--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
