package programmes;

public class Prog2 {

	public static void main(String[] args) 
	{
		int n=20;
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count>1)
		{
			System.out.println(n+" is prime");
		}
		else
			System.out.println(n+" is not prime");

	}

}
