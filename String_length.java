package string_class_methods;

import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class String_length 
{
	public void input(String input)
	{
		String input1="X".repeat(input.length()-4);
		String input2=input.substring(input.length()-4);
		String view=input1.concat(input2);
		System.out.println(view);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=sc.next();
		String_length obj=new String_length();
		obj.input(input);	
	}

}
