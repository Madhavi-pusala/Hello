package arrayprogram;
public class indexofarrayelement {
	
       public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] my_array = {35, 14, 46, 15, 36, 56, 75, 18, 16, 59};
      System.out.println("Index position of 75 is: " + findIndex(my_array, 75));
      System.out.println("Index position of 18 is: " + findIndex(my_array, 18));
       }
}
