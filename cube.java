import java.util.*;
import java.lang.*;
class cube
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer number");
		a=sc.nextInt();
		for(int i=2;i<10;i++)
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