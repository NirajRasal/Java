import java.util.*;
class stringMethods
{
	public static void main(String args[])
	{
		String s1="Niraj";
		String s2="Rasal";
		int x;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("\n\n*********  MENU  **********\n\n");
		System.out.println("\n1 .lower case \n2 .upper case \n3 .replace\n4 .check equality \n5 .length \n6 .find character\n7 .concat\n8 .subString \n9 .index of character\n10.exit\n");
		System.out.println("\n*********  END  ***********\n");
		System.out.println("\n Enter your choice:");
		x=sc.nextInt();
		System.out.println("");
		switch(x)
			{
				case 1:
				s2=s1.toLowerCase();
				System.out.println(s2);
				break;
			
				case 2:
				s2=s1.toUpperCase();
				System.out.println(s2);
				break;
			
				case 3:
				s1.replace('i','a');
				System.out.println(s1);
				break;
			
				case 4:
				System.out.println("**");
				break;
			
				case 5:
				int a=s1.length();
				System.out.println(a);
				break;
			
				case 6:
				System.out.println(s1.charAt(2));
				break;
			
				case 7:
				System.out.println(s1.concat(s2));
				break;
				
				case 8:
				System.out.println(s1.substring(0,3));
				break;
			
				case 9:
				System.out.println(s1.indexOf('r'));
				break;
			}
		}while(x!=10);
		
	}
}