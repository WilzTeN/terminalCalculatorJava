
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    System.out.println("Hello world.");

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("--- Calculator ---");
    System.out.println("(1): Addition\n(2): Subtract\n(3): Multiplication\n(4): Division\n(5): Exit");
    System.out.println("Select your option: ");
    int menu = scanner.nextInt();

    if (menu != 5) {
        System.out.println("Type the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Type the second number: ");
        int num2 = scanner.nextInt();

        int result;

        switch (menu) {
          case 1:
            result = num1 + num2; 
            System.out.println("The result is: " + result);
            break;
          case 2:
            result = num1 - num2;
            System.out.println("The result is: " + result);
            break;
          case 3: 
            result = num1 * num2;
            System.out.println("The result is: " + result);
            break;
          case 4:
            if (num2 != 0) {
              result = num1 / num2;
              System.out.println("The result is: " + result);
            } else {
              System.out.println("It's impossible to divide by zero.");
            }
            break;
          case 5:
            System.out.println("Exiting...");
            break;
          default:
            System.out.println("Select a valid option.");
            break;
        }
    } else {
        System.out.println("Exiting...");
    }
  }
}
 
