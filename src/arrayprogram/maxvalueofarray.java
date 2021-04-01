package arrayprogram;

public class maxvalueofarray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[]{10, 121, 88, 220, 12, 120};
	    int max = getMax(array);
	   System.out.println("Maximum Value is: "+max);
	} 
	 public static int getMax(int[] inputArray){ 
	        int maxValue = inputArray[0]; 
	        for(int i=1;i < inputArray.length;i++){ 
	          if(inputArray[i] > maxValue){ 
	             maxValue = inputArray[i]; 
	          } 
	        } 
	        return maxValue; 
	  
	}

}
