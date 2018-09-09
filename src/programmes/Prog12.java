package programmes;

public class Prog12 {

	public static void main(String[] args)
	{
		String s="this is java class";
		String[] a=s.split(" ");
		String s3="";
		int n=a.length;
		for(int i=n-1;i>=0;i--)
		{
			s3=s3+" "+a[i];
		}

		System.out.println(s3);
	}

}
