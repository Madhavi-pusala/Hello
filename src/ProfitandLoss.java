import java.util.Scanner;
 public class ProfitandLoss
{
	 private static Scanner sc;
   public static void main(String args[]) 
    {   
	int cp,sp;
            Scanner sc= new Scanner(System.in);
         	System.out.println("Enter the Costprice ");
         	cp = sc.nextInt();
		System.out.println("Enter the Selling price:");
         	sp = sc.nextInt();
         	
		if(cp-sp>0)
                {
		  System.out.println("loss:" +(cp-sp));
		}
		else if(cp-sp<0)
                {
		  System.out.println("profit:" +(sp-cp));
		}
		else
		
		  System.out.println("NEUTRAL");
		sc.close();
          
   }
}

