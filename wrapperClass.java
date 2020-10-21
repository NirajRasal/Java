import java.io.*;
class wrapperClass
{
	public static void main(String args[])
	{
		int i=10;
		System.out.println("primitive integer i="+i);
		Integer i1=new Integer(i);
		System.out.println("primitive integer i converted to integer object");
		System.out.println("integer object converted to primitive integer");
		int j=i1.intValue();
		System.out.println("j:"+j);
		System.out.println("converting numbers to string");
		int m=10,n=20;
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		String s1=Integer.toString(m);
		String s2=Integer.toString(n);
		System.out.println("concatination of two strings:"+(s1+s2));
	}
}
	