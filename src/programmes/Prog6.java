package programmes;

public class Prog6 {

	public static void main(String[] args)
	{
		int[] arr= {50,20,80,60,10,90};
		int n=arr.length;
		int temp;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
