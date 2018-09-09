package programmes;

public class Prog20 {

	public static void main(String[] args)
	{
		String s="shiny";
		int n=s.length(); int sp=3,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<st;k++)
			{
				System.out.print(s.charAt(k)+" ");
			}
			System.out.println();
			st++;sp--;
		}

	}

}
