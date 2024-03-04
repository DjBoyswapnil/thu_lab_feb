package string_class_methods;

import java.util.Scanner;

public class String_Duplicate 
{
	String sw="";
	public void input(String msg)
	{
		String str[]=msg.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]) && (i!=j))
				{
					sw=sw+str[i];
				}
			}
		}
		System.out.println(sw);
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=sc.nextLine();
		String_Duplicate sobj=new String_Duplicate();
		sobj.input(input);
		

	}

}
