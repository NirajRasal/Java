class a extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("\t thread threadA :i"+i);
		}
		System.out.println("exit from a");
	}
}
class b extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("\n from thread B i="+i);
		}
		System.out.println("exit from b");
	}
}
class c extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("\n from thread C i="+i);
		}
		System.out.println("exit from b");
	}
}
		class threadtest
		{
			public static void main(String args[])
			{
				new a().start();
				new b().start();
				new c().start();
			}
		}