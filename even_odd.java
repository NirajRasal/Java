import java.util.*;
import java.lang.*;
class even_odd
{
public static void main(String args[])
{
int a;
int b=1;
System.out.println("enter the number");
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a%2==0)
{
	System.out.println("even number");
}		
else
{
System.out.println("odd number");
}
}
}