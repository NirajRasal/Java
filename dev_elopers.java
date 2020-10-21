import java.util.*;
import java.lang.*;
import java.io.*;

class dev_elopers
{
	public static void main(String args[])
		{
			int i;
			int arr[]=new int[10];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter numbers");
			for(i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]==arr[i+1])
				{
					System.out.println(arr[i]);
				}
				else
				{
					System.out.println("no mathcing number");
				}				
			}
			
		}
}