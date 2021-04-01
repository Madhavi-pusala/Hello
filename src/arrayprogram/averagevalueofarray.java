package arrayprogram;

public class averagevalueofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{20, 30, 50, -40, 60, -100};
		
	       int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	       //calculate average value
	        double average = sum / numbers.length;
	        System.out.println("Average value of the array elements is : " + average);

	}

}
