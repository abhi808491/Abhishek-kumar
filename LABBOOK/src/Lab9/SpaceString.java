package Lab9;

import java.util.Scanner;

interface intrf1
{
	String formatString(String str);
}
public class SpaceString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		intrf1 ref=(s)->
		{
		String str2="";
		for(int i=0;i<s.length();i++)
		{
			str2=str2+s.charAt(i)+" ";
		}
			return str2;
		};
		
		System.out.println(ref.formatString(str));

}
}

