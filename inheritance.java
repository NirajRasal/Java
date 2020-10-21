import java.util.Scanner;
class room
{
	int length;
	int breadth;
	room(int x,int y)
	{
		length=x;
		breadth=y;
	}
}
int area( )
{
	return(length*breadth)
}
class bedroom extends room
{
	int height;
	bedroom(int x,int y,int z)
	{
		Super(x,y);
		height=z;
	}
	int volume( )
	{
		return(length*breadth*height);
	}
}
class inheritance
{
	public static void main(String args[])
	{
		bedroom room1=new bedroom(12,3,5);
		int area1=room1.area();
		int volume1=room1.volume();
		System.out.println("area="+area1);
		System.out.println("voluume="+volume1);
	}
}