import  java.util.*;
//import java.util.Vector;
class vector1
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		for(int i=0;i<args.length;i++)
		{
			v1.addElement(args[i]);
		}
		v1.insertElementAt("niraj",2);
		String newlist=new String[v1.size()];
		v1.copyInto(newlist);
		System.out.println("new list:");
		int s=v1.size();
		for(int i=0;i<s;i++)
		{
			System.out.println(newlist[i]);
		}
	}
}