package DEMO;

public class Constructor {
	
	static 
	{
		System.out.println("Static");
	}
    
	{
		System.out.println("Non-static");
	}
	public void m1()
	{
		System.out.println("Method");
	}
	
	public static void main(String[] args)
	{
	Constructor a =new Constructor();
	 a.m1();
    }
   public Constructor()
   {
    System.out.println("Constructor");
   }
}
