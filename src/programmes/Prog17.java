package programmes;

public class Prog17 {

	public static void main(String[] args) 
	{
		int n=4; int sp=3; int star=1;
		int l=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=sp;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
			star++;
			sp--;
		}
	}

}
