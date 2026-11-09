import java.util.Scanner;
public class Task6Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int i = sc.nextInt();
        System.out.print("Enter a float    : ");
        float f = sc.nextFloat();
        System.out.print("Enter a double   : ");
        double d = sc.nextDouble();

        System.out.println("\n===== Original Values =====");
        System.out.println("int    : " + i);
        System.out.println("float  : " + f);
        System.out.println("double : " + d);

        long iToLong = i;
        double iToDouble = i;
        double fToDouble = f;

        System.out.println("\n===== After Implicit Casting =====");
        System.out.println("int -> long     : " + iToLong);
        System.out.println("int -> double   : " + iToDouble);
        System.out.println("float -> double : " + fToDouble);

        int fToInt = (int) f;      // float  -> int
        int dToInt = (int) d;      // double -> int
        float dToFloat = (float) d; // double -> float

        System.out.println("\n===== After Explicit Casting =====");
        System.out.println("float -> int    : " + fToInt);
        System.out.println("double -> int   : " + dToInt);
        System.out.println("double -> float : " + dToFloat);

        sc.close();
    }
}