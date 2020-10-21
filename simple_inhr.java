import static java.lang.System.out;
import java.util.*;
class simple_inhr
{
	public
	static int a=10;
	
}
class asd extends inhr
{
	public static void display()
	{
		   
			out.println(a);
	}
}
class jadu
{
	public static void main(String args[])
	{
		asd a=new asd();
		a.display();
	}
}
		