class x implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("\t thread x:"+i);
		}
		System.out.println("end of thread");
	}
}
class RunableTest
{
	public static void main(String args[])
	{
		x run=new x();
		Thread thready=new Thread(run);
		thready.start();
		System.out.println("end of main thread");
	}
}