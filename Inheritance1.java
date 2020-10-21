import java.util.Scanner;
import java.util.*;
class room
{
	int length;
	int breadth;
	room(int x,int y)
	{
		length=x;
		breadth=y;
	}
    int area( )
    {
	return(length*breadth);
    }
}
class Bedroom extends room
{
	int height;
	Bedroom(int x,int y,int z)
	{
		super(x,y);
		height=z;
	}
	int volume( )
	{
		return(length*breadth*height);
	}
}
class Inheritance1
{
	public static void main(String args[])
	{
		Bedroom roomabc=new Bedroom(12,3,5);
		int area1=roomabc.area();
		int volume1=roomabc.volume();
		System.out.println(roomabc);
		System.out.println("area="+area1);
		System.out.println("voluume="+volume1);
	}
}