import java.util.Scanner;

public class calculatorfunction {

    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + addition(a, b));
        System.out.println("Subtraction = " + subtraction(a, b));
        System.out.println("Multiplication = " + multiplication(a, b));
        System.out.println("Division = " + division(a, b));

        
    }
}