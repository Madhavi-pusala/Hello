package arrayprogram;
import java.util.Scanner;
public class removingelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner(System.in);
	    int[] intArr = {4, 2, 6, 12, 15};
	    System.out.print("Enter Element to be deleted : ");
	    int elem = in.nextInt();
	    
	    for(int i = 0; i < intArr.length; i++){
	      if(intArr[i] == elem){
	     
	        for(int j = i; j < intArr.length - 1; j++){
	            intArr[j] = intArr[j+1];
	        }
	        break;
	      }
	    }
	      
	    System.out.println("Elements -- " );
	    for(int i = 0; i < intArr.length; i++){
	      System.out.print(" " + intArr[i]);
	    }     

	}

}
