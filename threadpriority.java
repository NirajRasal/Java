import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int k=1;k<5;k++)
		{
			System.out.println("\t thread threadA :i"+k);
			if(k==3)
			stop();
		}
		System.out.println("exit from a");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			if(i==1)
			yield();
			System.out.println("\n from thread B i="+i);
		}
		System.out.println("exit from b");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int j=0;j<5;j++)
		{
			System.out.println("\n from thread C i="+j);
			if(j==1)
			try
			{
				sleep(2000);
			}
			catch(Exception e)
			{

			}
		}
		System.out.println("exit from b");
	}
}
		class threadpriority
		{
			public static void main(String args[])
			{
				A threadA=new A();
				B threadB=new B();
				C threadC=new C();
				threadC.setPriority(Thread.MAX_PRIORITY);
				threadB.setPriority(threadA.getPriority( )+1);
				threadA.setPriority(Thread.MIN_PRIORITY);
				
				System.out.println("start thread a");
				threadA.start();
				System.out.println("start thread b");
				threadB.start();
				System.out.println("start thread c");
				threadC.start();
				
				System.out.println("End of main thread");
			}
		
		}
	