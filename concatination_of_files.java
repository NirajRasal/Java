import java.io.*;
public class concatination_of_files
{
	public static void main(String args[]) 
	    throws IOException{
		PrintWriter pw=new PrintWriter("a.txt");
		BufferedReader br=new BufferedReader(new FileReader("b.txt"));
		String line=br.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br.readLine();
		}
		br=new BufferedReader(new FileReader("c.txt"));
		line=br.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
		System.out.println("file concatination is done");
	}
}