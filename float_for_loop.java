import java.util.*;
import java.lang.*;
import java.math.*;

class float_for_loop
{
	public static void main(String args[])
	{
		int a;
		double i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer number");
		a=sc.nextInt();
		for(i=1.10;i<=10.00;i+=0.10)
		{
			if(i*i*i==a)
			{
				System.out.println("The cube of "+a+" is: "+i);
				break;
			}
			else
			{
				System.out.println("no root");
				break;
			}
		}
	}
}	