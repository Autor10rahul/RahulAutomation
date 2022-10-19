package Package1;

public class Constructor 
{
	public Constructor()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
		
	}
	public Constructor(int a)
	{
		this(1,2);
		System.out.println("One Parameterized Constructor");
	}
	public Constructor(int a,int b)
	{
		this();
		System.out.println("Two Parameterized Constructor");
	}
	public Constructor(int a,int b,int c)
	{
	
		System.out.println("Three Parameterized Constructor");
	}
	public static void main(String[] args)
	{
		Constructor obj=new Constructor(1);
		
	}
}
