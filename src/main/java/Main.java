import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Welcome to the calculator app");
    System.out.println("Enter a command:");
    Calculator calculator = new Calculator();
    while(true) {
      String input = myObj.nextLine();

      if ((input).startsWith("add")) {
       int one = (int)input.charAt(4) - 48;
       int two = (int) (input.charAt(6)) - 48;
        System.out.println(calculator.add(one, two));
      }
      else if (input.startsWith("subtract")) {
        int one = (int)input.charAt(9) - 48;
        int two = (int) (input.charAt(11)) - 48;
        System.out.println(calculator.subtract(one, two));
      }
      else if (input.startsWith("fibonacci")) {
        int one = (int)input.charAt(10) - 48;
        System.out.println(calculator.fibonacciNumberFinder(one));
      }
      else if (input.startsWith("multiply")) {
        int one = (int) input.charAt(9) - 48;
        int two = (int) input.charAt(11) - 48;
        System.out.println(calculator.multiply(one, two));

      }
      else if (input.startsWith("divide")) {
        int one = (int) input.charAt(7) - 48;
        int two = (int) input.charAt(9) - 48;
        System.out.println(calculator.divide(one, two));
      }
      else if (input.startsWith("binary")) {
        int one = (int) input.charAt(7) - 48;
        System.out.println(calculator.intToBinaryNumber(one));
      }

    }

  }
}
