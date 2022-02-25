package Lab6;

import java.util.HashMap;
import java.util.Scanner;

public class SquareMap {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap m1=getSquare(arr);
		System.out.println(m1);
	}
	public static HashMap getSquare(int[] arr)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i]*arr[i];
			map.put(arr[i], n);
		}
		return map;
	}

}
