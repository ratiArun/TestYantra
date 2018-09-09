package programmes;

public class Prog15 {

	public static void main(String[] args) 
	{
		String s="arunkumar";
		char[]a=s.toCharArray();
		int n=a.length;
		String s1="";
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=0;
					}
				}
				s1=s1+a[i];
			}
		}
		System.out.println(s1);

	}

}
