package Lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CharacterCOunt {

	public static void main(String[] args) {
	//char[] ar1=new char[]{'a','b','a','c','a'};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] ar1=new char[n];
		for(int i=0;i<n;i++)
		{
			 ar1[i]=sc.next().charAt(0);
		}
	
	 HashMap<Character,Integer> mp1=countChar(ar1);
	 System.out.println(mp1);
	 

	}
public static HashMap countChar(char[] arr)
{
	
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int count=map.get(arr[i]);
				map.put(arr[i], ++count);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		return map;

}
}
