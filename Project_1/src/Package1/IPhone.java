package Package1;

public class IPhone
{
	public IPhone(int a,int b,int c)
	{
	System.out.println("Three Parameterized contructor");
	}
	public IPhone()
	{
	System.out.println("Default contructor");
	}
	public IPhone(int a,int b)
	{
	System.out.println("Two Parameterized contructor");
	}
	public IPhone(int a)
	{
	System.out.println("One Parameterized contructor");
	}
	public static void main(String[] args)
	{
	IPhone obj1=new IPhone(11,22,21);
	IPhone obj2=new IPhone();
	IPhone obj3=new IPhone(22,55);
	IPhone obj4=new IPhone(88);
	
	}
	
}
	
	
