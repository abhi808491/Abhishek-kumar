package Lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(getSecond(arr));
		
		
		

	}
	public static int getSecond(int[] arr)
	{
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}
		Collections.sort(al);
		
		return al.get(1);
		
	}

}
