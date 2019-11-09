package Srishti.com;
import java.util.*;
public class PerfectSubarray
{
	static boolean checkperfectsquare(int q)
	{
		int i=(int)Math.sqrt(q);
	
		if(q==i*i)
			return true;
		else
			return false;
	}
public static void main(String args[])
{
	int arr[]= {1 ,4,2,3};
	int n=arr.length;
	int sum=0;
	//int arr1[]=new int[100];
	for(int i=0;i<n;i++)
	{
		 sum=0;
	for(int j=i;j<n;j++)
	{
		sum+=arr[j];
		if(checkperfectsquare(sum))
			sum++;			
		
	}
	}
	
System.out.println(sum);		
	
}
}
