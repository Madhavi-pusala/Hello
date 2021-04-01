import java.util.Scanner;

public class DriverInsurance {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
 int a;
 char s,g;
 System.out.println("Enter the age");
 a=sc.nextInt();
 System.out.println("Enter the married status");
 System.out.println("M For married & U for unmarried");
 s=sc.next().charAt(0);
 System.out.println("Enter the Gender");
 System.out.println("X For Male & Y For Female");
 g=sc.next().charAt(0);
 if(s=='m'||s=='u'&&a>30&&g=='X'||s=='U'&&a>25&&g=='Y')
 {
 System.out.println("Insured");
 }
  else 
 {
	 
 
	 System.out.println("Not Insured");
 }

	}

}
