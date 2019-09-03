import java.util.*;
class Genric 
{
	Scanner s=new Scanner(System.in);
	<s>void odd(s []arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			int a=(Integer)arr[i];
			if(a%2!=0)
				System.out.println("\n "+a);
		}
		
	}
	<s>void exchange(s []arr)
	{
		System.out.println("\n Enter the two positions to be Exchanged..");
		int pos1=s.nextInt();
		int pos2=s.nextInt();
		s temp;
		temp=arr[pos1];
		arr[pos1]=arr[pos2];
		arr[pos1]=temp;
		System.out.println("\n Exchanged:"+arr);
		
	}
	<s extends Comparable<s>>void max (s []arr,int n)
	{
		s max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i].compareTo(max)>0)
				max=arr[i];
		}
		System.out.println("\n maximum Element:"+max);
		
		
	}
}
public class GenricMethod {
	public static void main(String []args)
	{
		
	}
}
