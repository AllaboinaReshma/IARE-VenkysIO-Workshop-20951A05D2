import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		for(int i=s.length();i>0;i--)
		{
		    System.out.print(s.charAt(i-1));
		}
	}
}
