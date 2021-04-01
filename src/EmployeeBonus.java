import java.util.Scanner;

public class EmployeeBonus
{
    	public static void main( String[] args ) 
    	{
		Scanner EB = new Scanner(System.in);

		int bonus, cur_year, year_joining, year_of_ser ;

		System.out.print("\nEnter Current Year:" );
		cur_year =EB.nextInt();

		System.out.print("\nEnter Year of Joining :" );
		year_joining = EB.nextInt();
	
		year_of_ser = cur_year - year_joining;
		if (year_of_ser > 3)
		{	
			bonus = 2500 ;
			System.out.print("\nBonus = Rs." + bonus);
		}
		EB.close();
    	}
}