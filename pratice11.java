import java.util.*;
import java.lang.*;

class dev_elopers
{
	public static void main(String args[])
		{
			int arr[]=new int[5];
			System.out.println("enter five numbers");
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<5;i++)
			{
				if(arr[i]==arr[i+1])
				{
					Syste.out.println(arr[i]);
				}
			}
			
		}
}