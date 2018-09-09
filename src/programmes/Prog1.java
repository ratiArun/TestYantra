package programmes;

public class Prog1 {

	public static void main(String[] args)
	{
		int n1=0,n2=1;
		int n3=n1+n2;
		System.out.println(n1);
		System.out.println(n2);

		while(n3<100)
		{
			System.out.println(n3);
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
		
	}

}
