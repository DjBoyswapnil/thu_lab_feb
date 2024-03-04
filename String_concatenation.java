package string_class_methods;
class emptynull extends Exception
{
	public emptynull(String msg) 
	{
		super(msg);
	}
}
public class String_concatenation 
{
	public void input(String []input) throws Exception
	{ 
		String SB="";
		for(int i=0;i<input.length;i++)
		{
			SB=SB+" "+input[i];
		}
		System.out.println(SB);
		if(SB.isEmpty())
		{
			throw new emptynull("String array must be field");
		}
	}
	
	public static void main(String[] args)  throws Exception
	{
		String str[]= {"swapnil","is","good","Boy"};
		String str1[]= {"Shreyash","is","Bad","Boy"};
		String str2[]= {};
		String_concatenation obj=new String_concatenation();
		obj.input(str);
		obj.input(str1);
		obj.input(str2);
	}

}
