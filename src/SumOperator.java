import java.util.Scanner;

public class SumOperator {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the first number: ");
    int num1 = in.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = in.nextInt();
    int sum = num1 + num2;
    System.out.println();
    System.out.println("Sum: "+sum);
    in.close();
  }
}
