package DEMO;

public class Global
{
	int i =20;
	int a=30;

  public void m1()
  {
		System.out.println(i);
  }
   public void m2()
   {
	   System.out.println(a);
   }
   public static void main (String[]args)
   {
	   Global m=new Global();
	   m.m1();
	   m.m2();
	   
   }
}
