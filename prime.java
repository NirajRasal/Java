class prime
{
  	public static void main(String args[])
  	{
        int a=13,b=0;
	for(int i=2;i<=a;i++)
	{
	if(a%i==0)
	b++;
	}
		if(b==1)
		{
		System.out.println("number is prime");
		}
			else
			{
			System.out.println("number is not prime");
 			}
  	}
}