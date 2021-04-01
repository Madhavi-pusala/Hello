import java.util.Scanner;

public class TotalofFiveSubjects{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	    float total, percentage, Average;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks: ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();	
		
		total = english + chemistry + computers + physics + maths;
		Average = total / 5;
	    percentage = (total / 500) * 100;
	    
	    System.out.print("Student get %0.2f percentage. " + percentage);
		if (percentage >= 60)
			System.out.print("\n1st Division \n");
		else if (percentage >= 50 && percentage <= 59)
			System.out.print("\n2nd Division \n");
		else if (percentage >= 40 && percentage <= 49)
			System.out.print("\n3rd Division \n");
		else if (percentage<40)
			System.out.print("\nFail");
	  
	}
}