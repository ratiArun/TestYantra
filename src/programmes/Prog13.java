package programmes;

public class Prog13 {

	public static void main(String[] args)
	{
		String s="arunkumar";
		char[] a=s.toCharArray();
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			
			if(a[i]!=0)
			{
				int count=1;
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=0;
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
			
		}

	}

}
