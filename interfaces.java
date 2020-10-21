import java.util.*;
class student
{
	int rollNumber;
	void getNumber(int n)
	{
		rollNumber=n;
	}
	void putNumber()
	{
		System.out.println("roll no is:"+rollNumber);
	}
}
class test extends student
{
	float part1,part2;
	void getMarks(float m1,float m2)
	{
		part1=m1;
		part2=m2;
	}
	void putMarks()
	{
		System.out.println("part1:"+part1);
		System.out.println("part2:"+part2);
	}
}
interface sport
{
	float sportwt=6.0f;
	void putwt();
}
class result extends test implements sport
{
	float total;
	public void putwt()
	{
		System.out.println("sports wt"+sportwt);
	}
	void display()
	{
		total=part1+part2+sportwt;
		putNumber();
		putMarks();
		putwt();
		System.out.println("total score"+total);
	}
	
}
class interfaces
{
	public static void main(String args[])
	{
		result student1=new result();
		student1.getNumber(1234);
		student1.getMarks(27.5f,33.0f);
		student1.display();
	}
}