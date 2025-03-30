import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the first number: ");
  int a = scanner.nextInt();

 System.out.print("Enter the second number: ");
  int b = scanner.nextInt();

  try{
      int answer = a/b;
      System.out.println("The answer is: " + answer);
   }catch (ArithmeticException e)
  
     System.out.println("Cannot divide by zero!");
     
  }
  
  scanner.close();

}
    
    