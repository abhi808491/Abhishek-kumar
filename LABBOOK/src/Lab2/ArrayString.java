package Lab2;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		stringCase(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}

	}
	public static String[] stringCase(String arr[])
	{
		String s1;
		int mid;
		
			if(arr.length%2==0)
			{
				mid=arr.length/2;
				for(int i=0;i<mid;i++)
			{
		
			s1=arr[i].toUpperCase();
			arr[i]=s1;
			}
				for(int i=mid;i<arr.length;i++)
				{
				s1=arr[i].toLowerCase();
				arr[i]=s1;
				}
				
			}
			else
			{
				mid=(arr.length/2)+1;
				for(int i=0;i<mid;i++)
				{
			
				s1=arr[i].toUpperCase();
				arr[i]=s1;
				}
			for(int i=mid;i<arr.length;i++)
			{
			s1=arr[i].toLowerCase();
			arr[i]=s1;
			}
		}
		return arr;
	}

}
