package Lab3;

import java.io.StreamTokenizer;
import java.util.*;

public class Token {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
	String s=sc.nextLine();
	StringTokenizer st=new StringTokenizer(s," ");
	while(st.hasMoreTokens())
	{
		int i=Integer.parseInt(st.nextToken());
		System.out.println(i);
		sum=sum+i;
	}
	System.out.println(sum);

}
}
