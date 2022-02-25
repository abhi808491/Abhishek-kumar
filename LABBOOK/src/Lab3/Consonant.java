package Lab3;

import java.util.Scanner;

public class Consonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s1=alterString(str);
		System.out.println(s1);
		sc.close();
	}
	public static String alterString(String str)
	{
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
			{
		       s1=s1+str.charAt(i);
			}
			else if(str.charAt(i)=='Z')
				s1=s1+'A';
			else if(str.charAt(i)=='z')
				s1=s1+'a';
			else
			{
				s1=s1+(char)(str.charAt(i)+1);
			}
		}
		return s1;

	}

}
