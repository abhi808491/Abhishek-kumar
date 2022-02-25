package Lab1;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			String light=sc.next();
			switch(light)
			{
			case "red":System.out.println("stop");
			break;
			case "yellow": System.out.println("wait");
			break;
			case "green": System.out.println("go");
			default: System.out.println("Invalid");
			
		}
		
	}

}
