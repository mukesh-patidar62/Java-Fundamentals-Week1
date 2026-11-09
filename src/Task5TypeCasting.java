public class Task5TypeCasting {
    public static void main(String[] args) {

        int intNum = 100;
        long longNum = intNum;
        float floatNum = longNum;
        double doubleNum = floatNum;

        System.out.println("===== Implicit Type Casting =====");
        System.out.println("int value    : " + intNum);
        System.out.println("long value   : " + longNum);
        System.out.println("float value  : " + floatNum);
        System.out.println("double value : " + doubleNum);

        double d = 9.78;
        float f = (float) d;
        long l = (long) d;
        int i = (int) d;
        byte b = (byte) 130;

        System.out.println("\n===== Explicit Type Casting =====");
        System.out.println("Original double : " + d);
        System.out.println("double -> float : " + f);
        System.out.println("double -> long  : " + l);
        System.out.println("double -> int   : " + i);
        System.out.println("int 130 -> byte : " + b);
    }
}