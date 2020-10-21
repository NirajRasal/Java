import java.util.*;
class vector
{
public static void main(String args[])
{
	vector list=new vector();
	int length=args.length;
	for(int i=0;i<length;i++)
	{
		list.addElement(args[i]);
	}
	list.insertElementAt("java",2);
	int size=list.size;
	String listarray[]=new String[size];
	list.copyInto(listArray);
	System.out.println("list oof languages:");
	for(int i=0;i<size;i++)
	{
		System.out.println(listArray[i]);
	}
}
}