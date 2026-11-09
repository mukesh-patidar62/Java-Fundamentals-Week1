import java.util.Scanner;
public class Task4Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        double a = sc.nextDouble();
        System.out.print("Enter second number : ");
        double b = sc.nextDouble();

        System.out.println("\n===== Results =====");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
            System.out.println(a + " % " + b + " = " + (a % b));
        } else {
            System.out.println("Division and Modulus not possible: second number is 0");
        }

        sc.close();
    }
}