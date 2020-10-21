import java.util.*;
import java.util.Scanner;
class primeno
{
public static void main(String arg[])
{
int a,b=0,i;
System.out.println("enter the no");
Scanner abc=new Scanner(System.in);
a=abc.nextInt();
for(i=1;i<=a;i++)
{
if(a%i==0)
b++;
}
if(b==2)
{
System.out.println("number is prime");
}
else
{
System.out.println("number is not prime");
}
}
}