package programmes;

public class Prog4 {

	public static void main(String[] args)
	{
		String s="arun";
		int n=s.length();
		String s2="";
		for(int i=n-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);

	}

}
