import java.io.*;
import java.util.*;
class Alp
{
	public static void main(String []args)
	{
		char ch;
		System.out.println("Enter the character:");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
		  System.out.println("It is  an upper case");
		}
		else if(ch>='a'&& ch<='z')
		{
		  System.out.println("It is lowercase");
		}
		else
		{
			System.out.println("Not an aplhabet");	
		}

	}
}