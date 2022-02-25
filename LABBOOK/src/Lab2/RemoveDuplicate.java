package Lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[]arr1=m1(arr);
		
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
		

	}
	public static int[] m1(int arr[])
	{
		TreeSet<Integer> ts1=new TreeSet<>();
		for(int i=0;i<arr.length;i++)
		{
			ts1.add(arr[i]);
		}
		Object arr1[]=ts1.toArray();
		int arr2[]=new int[arr1.length];
		System.out.println(ts1);
		Arrays.sort(arr1,Collections.reverseOrder());
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=(int)arr1[i];
		
		}
		return arr2;
	}

}
