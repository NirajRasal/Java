import java.util.*;
import java.io.*; 
	class matrix
	{
		public static void main(String args[])
		{ 
			int j,m,n;
			Scanner s=new Scanner(System.in);
			Scanner w=new Scanner(System.in);
			System.out.println("enter the rows");
			m=q.nextInt();
			Scanner q=new Scanner(System.in);
			System.out.println("enter the columns");
			n = extracted(w);
			int a[][]=new int[m][n];
			System.out.println("enter element of first matrix");
			for(int i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=s.nextInt();
				}
			}
			int b[][]=new int[m][n];
			System.out.println("enter element of second matrix");
			for(int i=0;i<m;i++)
			{
				for( j=0;j<n;j++)
				{
					b[i][j]=s.nextInt();
				}
			}
			int c[][]=new int[m][n];
			System.out.println("addition is:");
			for(int i=0;i<m;i++)
			{
				for( j=0;j<n;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+"");	
			    }
				System.out.println("");
			}
				int d[][]=new int[m][n];
				System.out.println("multiplication is:");
				for(int i=0;i<m;i++)
			{
				for( j=0;j<n;j++)
				{
					d[i][j]=0;
					for(int k=0;k<n;k++)
					{
					d[i][j]+=a[i][k]*b[k][j];
					}
					System.out.print(d[i][j]+" ");
				}	
					System.out.println(" ");
			}
			int e[][]=new int[m][n];
			System.out.println("transpose is:");
			for(int i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					 e[i][j]=a[j][i];
			        System.out.print(e[i][j]+" ");
				}
				System.out.println(" ");
		}	}

	private static int extracted(Scanner w) {
		int n;
		n = w.nextInt();
		return n;
	}
	}
