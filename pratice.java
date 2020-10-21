import java.util.*;
import java.lang.*;

class pratice
{
	public static void main(String args[])
		{
			int arr[]=new int[3];
			int i;
			System.out.println("enter three numbers");
			Scanner sc=new Scanner(System.in);
			for(i=0;i<=3;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(i=0;i<5;i++)
			{
				if(arr[i]<arr[i+1])
				{
					System.out.println(arr[i]);
				}
			}
			if(arr[0]<arr[1])
			{
				System.out.print(arr[0]);
				System.out.print(arr[1]);
			}
			if(arr[0]<arr[1] && arr[1]<arr[2])
			{
				System.out.print(arr[0]);
				System.out.print(arr[1]);
				System.out.print(arr[2]);
				
			}
		}	
}			