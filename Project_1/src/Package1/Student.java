package Package1;

public class Student
{
	public Student(int a,int b,int c)
	{
	System.out.println("three parametrized constructor");
	}
	public Student()
	{
	System.out.println("Detault constructor");
	}
	public Student(int a,int b)
	{
	System.out.println("two parametrized constructor");
	}
	public Student(int a)
	{
	System.out.println("one parametrized constructor");
	}
	public static void main(String[] args)
	{
	Student obj3=new Student(11,55,44);
	Student obj1=new Student();
	Student obj2=new Student(11,22);
	Student obj4=new Student(11);
   }
}
	
