package DEMO;

public class A
{
	int c=20;              //global variable 
	
	public void m1()
	{
		System.out.println(c);     //local variable
	}
	public void m2() 
	{ 
		System.out.println(c);
	}
	

	public static void main(String[] args)
	{
		A a = new A ();
		a.m1();
		a.m2();

	}

}
