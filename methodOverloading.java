import java.util.*;
class methodOverloading
{
	public int sum(int x,int y)
	{
		return(x + y);
	}
	public int sum(int x,int y,int z)
	{
		return(x+y+z);
	}
	public static void main(String args[])
	{
	methodOverloading s=new methodOverloading();
	System.out.println(s.sum(10, 20));
	System.out.println(s.sum(10, 20, 30));
	//System.out.println(s.sum(2.3, 4.5));
	}
}