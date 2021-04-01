package arrayprogram;
import java.util.Arrays; 
public class reversearray {
public static void main(String[] args){   
    int[] my_array1 = {
            1988, 2018, 1985, 1456, 2013, 
            1458, 2305, 1254, 2019, 2308, 
            1456, 2165, 1966, 1609};
  System.out.println("Original array : "+Arrays.toString(my_array1));  
   for(int i = 0; i < my_array1.length / 2; i++)
  {
    int temp = my_array1[i];
    my_array1[i] = my_array1[my_array1.length - i - 1];
    my_array1[my_array1.length - i - 1] = temp;
  }
    System.out.println("Reverse array : "+Arrays.toString(my_array1));
}
}