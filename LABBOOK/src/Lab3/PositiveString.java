package Lab3;

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(positiveCheck(str));
		sc.close();
	}
	public static boolean positiveCheck(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
		 int n1=(int)str.charAt(i);
		 int n2=(int)str.charAt(i+1);
		 if(n1>n2)
			 return false;
		
		}
		return true;
		

	}

}
