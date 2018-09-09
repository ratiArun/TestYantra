package programmes;

public class Prog3 {

	public static void main(String[] args)
	{
		int n=1000;
		
		for(int i=1;i<n;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
