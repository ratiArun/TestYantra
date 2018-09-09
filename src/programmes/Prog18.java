package programmes;

public class Prog18 {

	public static void main(String[] args)
	{
		int n=4,sp=0,st=4;
		int l=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print(l+" ");
				l--;
			}
			System.out.println();
			st--;sp++;
		}

	}

}
