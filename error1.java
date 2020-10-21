import java.util.*;
import java.lang.*;
class error1
{
	public static void main(String args[])
	{
		int a=10,b=5,c=5,x,y;
		try
		{
			x=a/(b-c);   //divided by zero
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero");               //exception caugt
		}
		y=a/(b+c);        //normal division
		System.out.println("y="+y);
	}
}
		