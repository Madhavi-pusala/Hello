import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		int fact = 1;
		System.out.println("Enter a number to cal its factorial");
		num = in.nextInt();
		for(int i=1; i<=num;i++)
		{
			fact*=i;
		}
				
System.out.println("Factorial: "+ fact);
	}

}
