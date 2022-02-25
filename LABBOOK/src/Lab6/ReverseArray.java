package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=numberRev(arr);
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr1[i]);
		}

	}
	public static int[] numberRev(int[] arr)
	{
		ArrayList <Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			String s1=Integer.toString(arr[i]);
			StringBuffer sb=new StringBuffer(s1);
			sb.reverse();
			ls.add(Integer.parseInt(sb.toString()));
			
		}
		Collections.sort(ls);
		Object arr1[]=ls.toArray();
		int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=(int)arr1[i];
		}
		return arr2;
		
		
	}

}
