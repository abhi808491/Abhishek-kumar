package Lab3;

import java.util.Scanner;

public class Mirror {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(getImage(str));
		sc.close();
	}
	public static String getImage(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		String s2=sb.reverse().toString();
		String s3=str+"|"+s2;
		return s3;
		
	}

}
