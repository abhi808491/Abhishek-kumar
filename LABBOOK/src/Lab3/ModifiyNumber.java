package Lab3;

import java.util.Scanner;

public class ModifiyNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		modifyNumber(n);
		sc.close();
		
	}
	public static void modifyNumber(String n)
	{
		char arr[]=n.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length-1;i++)
		{
			int num1=(int)arr[i];
			int num2=(int)arr[i+1];
			if(num1-num2>0)
				sb.append(num1-num2);
			else if(num2-num1>0)
				sb.append(num2-num1);
			
		}
		sb.append(n.charAt(n.length()-1));
		System.out.println(sb);
	}

}
