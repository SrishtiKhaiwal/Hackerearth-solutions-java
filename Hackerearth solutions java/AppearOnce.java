package Srishti.com;

public class AppearOnce 
{
public static void main(String args[])
{
	int arr[]= {1, 2 ,2 ,1, 2, 1, 4,3};
	int n=arr.length;
	boolean visited[]=new boolean[n];
	boolean duplicate=false;
	for(int i=0;i<n;i++)
	{
		
		if(visited[i]==false)
		{
			duplicate=false;;
		}
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				duplicate=true;
				visited[j]=true;
			}
		}
		
		if(!duplicate)
		{
			System.out.println(arr[i]);
		}
	}
	
}
}
