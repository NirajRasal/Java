import java.io.*;
class filehandling
{
	public static void main(String args[]) 
	    throws Exception{
		FileInputStream fin=new FileInputStream("abc.txt");
		FileOutputStream fout=new FileOutputStream("xyz.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			fout.write((byte)i);
		}
		fin.close();
	}
}
		