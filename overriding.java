import java.util.*;
class Super
{
	int x;
	Super(int x)
	{
		this.x=x;
	}
	void dissplay()
	{
		System.out.println("super x="+x);
	}
}
class sub extends Super
{
	int y;
	sub(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("Super x="+x);
		System.out.println("sub y="+y);
	}
}
class overriding
{
	public static void main(String args[])
	{
	sub	s1=new sub(10,20);
	s1.display();
	}
}	