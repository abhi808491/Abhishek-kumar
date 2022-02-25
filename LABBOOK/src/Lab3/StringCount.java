package Lab3;

import java.util.Scanner;

public class StringCount {
	public static void main(String [] args )
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		System.out.println("Number of character= "+ch.length);
		String arr1[]=str.split(" ");
		System.out.println("Number of word= "+arr1.length);
		String arr2[]=str.split("[!?.:]");
		System.out.println("Number of sentence= "+arr2.length);
		sc.close();
		
	}

}
