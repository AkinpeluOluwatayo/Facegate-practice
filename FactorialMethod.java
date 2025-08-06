import java.util.Scanner;
  public class FactorialMethod {
     public static void main(String[] args){

       multiply();
     }
      public static void multiply(){
      Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Factorial Number");
       int input = scanner.nextInt();
 	int factorial = 1;
    for (int index = 2; index <= input; index++){

		factorial *= index;

      }
 	System.out.println("Factorial of " + input + " is: " + factorial);

    }

}