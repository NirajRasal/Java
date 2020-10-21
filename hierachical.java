import java.util.*;
class inhr
{
	static int a=90;
}
class a extends inhr
{
	static int b=20;
	
	static void addition()
	{
		int c=a+b;
	System.out.println("addition od 10+20 is"+c);
	}
}
class b extends inhr
{
	static int d=30;
	
	static void mult()
	{
	int f=a*d;
	System.out.println("multilication is:"+f);
	}
}
class e extends inhr
{
	static int p=40;
	
	static void subtraction()
	{
		int q=a-p;
		System.out.println("subtraction is"+q);
	}
}
class hierachical
{
	public static void main(String args[])
	{
		a add=new a();
		b mul=new b();
		e sub=new e();
		a.addition();
		b.mult();
		e.subtraction();
	}
}