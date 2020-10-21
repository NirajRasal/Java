import java.util.Arrays; 
 class array 
{
  public static void main(String[] args) 
    {
        int[] my_array = {6, 2, 5, 5, 6, 6, 7, 2};
		int x = my_array.length;
		 System.out.println("length of array is:"+x);
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]))
                {
                 
				 System.out.println("Duplicate Element : "+my_array[j]);
				 
                }
            }
        }
    }    
}
