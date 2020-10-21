import java.lang.*;

public class cbrt 
{

	public static void main(String[] args) 
	{

      // get two double numbers
      double x = 125;
      double y = 10;

      // print the cube roots of three numbers
      System.out.println("Math.cbrt(" + x + ")=" + Math.cbrt(x));
      System.out.println("Math.cbrt(" + y + ")=" + Math.cbrt(y));
      System.out.println("Math.cbrt(-27)=" + Math.cbrt(-27));
   }
}