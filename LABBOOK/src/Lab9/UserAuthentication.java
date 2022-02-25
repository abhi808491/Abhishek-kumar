package Lab9;

import java.util.Scanner;
interface intrf3
{
	boolean checkUser(String a,String b);
}

public class UserAuthentication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name to create");
		String str1=sc.nextLine();
		System.out.println("Enter password to create");
		String str2=sc.nextLine();
		System.out.println("Enter user name to login");
		String str3=sc.nextLine();
		System.out.println("Enter password to login");
		String str4=sc.nextLine();
	intrf3 ref=(c,d)->
	{
		if(c.equals(str3) && d.equals(str4))
			return true;
		else
			return false;
	};
	System.out.println(ref.checkUser(str3, str4));
		

	}

}
