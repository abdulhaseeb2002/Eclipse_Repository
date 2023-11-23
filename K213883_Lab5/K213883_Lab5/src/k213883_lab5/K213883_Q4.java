package k213883_lab5;
import java.util.Scanner;

public class K213883_Q4 {

    public static <T extends Number> double add(T var1, T var2) 
    {
        return var1.doubleValue() + var2.doubleValue();
    }

    public static <T extends Number> double subtract(T var1, T var2) 
    {
        return var1.doubleValue() - var2.doubleValue();
    }

    public static <T extends Number> double multiply(T var1, T var2) 
    {
        return var1.doubleValue() * var2.doubleValue();
    }

    public static <T extends Number> double divide(T var1, T var2) 
    {
        if (var2.doubleValue() == 0) {
            throw new ArithmeticException("Divide by zero exception!!!");
        }
        return var1.doubleValue() / var2.doubleValue();
    }

    public static void main(String[] args) 
    {
        int var1_int;
        int var2_int;
        double var1_double;
        double var2_double;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter two integers with spaces : ");
            var1_int = scanner.nextInt();
            var2_int = scanner.nextInt();
            System.out.print("Enter two doubles with spaces :");
            var1_double = scanner.nextDouble();
            var2_double = scanner.nextDouble();
        }

        System.out.println("\nFor Integers:\nAddition : " + add(var1_int, var2_int));
        System.out.println("Subtraction : " + subtract(var1_int, var2_int));
        System.out.println("Multiplication : " + multiply(var1_int, var2_int));
        System.out.println("Division : " + divide(var1_int, var2_int));

        System.out.println("\nFor Doubles:\nAddition : " + add(var1_double, var2_double));
        System.out.println("Subtraction : " + subtract(var1_double, var2_double));
        System.out.println("Multiplication : " + multiply(var1_double, var2_double));
        System.out.println("Division : " + divide(var1_double, var2_double));
    }
}