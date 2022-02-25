package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		m1(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}
	public static int[] m1(int arr[])
	{
		int rev=0;
		for(int i=0;i<arr.length;i++)
		{
			rev=0;
			while(arr[i]!=0)
			{
				int digit=arr[i]%10;
				 rev=rev*10+digit;
				arr[i]=arr[i]/10;
				
			}
			arr[i]=rev;
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		return arr;
	}

}
