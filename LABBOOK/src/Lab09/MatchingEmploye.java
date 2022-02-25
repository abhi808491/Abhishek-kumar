package Lab09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingEmploye {
	String empname;
	String username;
	MatchingEmploye(String empname,String username)
	{
		this.empname=empname;
		this.username=username;
	}
		
	
				

	@Override
	public String toString() {
		return " [empname=" + empname + ", username=" + username + "]";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		String name=sc.nextLine();
		System.out.println("Enter employee id");
		String userid=sc.nextLine();
		MatchingEmploye emp=new MatchingEmploye(name,userid);
		System.out.println(emp);
		System.out.println(MatchingEmploye.matchUser(userid));
		if(MatchingEmploye.matchUser(userid))
		{
			System.out.println("Id is correct");
		}
		else
			System.out.println("Please provide valid user name");
		

	}
	static boolean matchUser(String userid)
	{
		Pattern p=Pattern.compile("[a-zA-Z]{8,}_job");
		Matcher m=p.matcher(userid);
		boolean b=m.matches();
		return b;
	}

}
