package arrayprogram;

public class minvalueofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[]{10, 121, 88, 220, 12, 120};
	    int max = getMin(array);
	   System.out.println("Maximum Value is: "+max);
	}
		public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  }

}
