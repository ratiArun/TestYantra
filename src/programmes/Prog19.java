package programmes;

public class Prog19 {

	public static void main(String[] args)
	{
		String s="shiny";
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<=i)
				{
					System.out.print(s.charAt(j));
				}
				else
					System.out.print(" "
							);
			}
			System.out.println();
		}

	}

}
