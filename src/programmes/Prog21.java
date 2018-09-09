package programmes;

public class Prog21 {

	public static void main(String[] args)
	{
		int n=5;int sp=4,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print(k%2+" ");
			}
			System.out.println();
			st++;sp--;
		}

	}

}
