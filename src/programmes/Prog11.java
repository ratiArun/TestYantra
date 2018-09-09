package programmes;

public class Prog11 {

	public static void main(String[] args) 
	{
		int[]a= {10,20,50,20,10};
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
				if(count>1)
				{
					System.out.println(a[i]+" "+count);
				}
			}
			
		}

	}

}
