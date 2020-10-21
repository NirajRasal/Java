class MultipleCatch
{
	public static void main(String args[])
	{
		int a[]={5,5,5};
		int b=0;
		try
		{
			int x=a[2]/b;
		}
		catch(ArithmeticException x)
		{
			System.out.println("division by zero");
		}
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println("Array index error");
		}
		catch(ArrayStoreException x)
		{
			System.out.println("wrong datatype");
		}
		int y=a[1]/a[0];
		System.out.println("y="+y);
	}
}