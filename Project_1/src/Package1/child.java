package Package1;

public class child
{

public child(int a,int b,int c)
{

	System.out.println("Three parameterized constructor");
	
}
public child()
{
	this(12,56,67);
	System.out.println("defult constructor");
}
public child (int a,int b)
{
	this();
}
}