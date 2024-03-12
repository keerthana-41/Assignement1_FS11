import java.util.*;

public class Operators{
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c){
        return a + b + c;
    }
    
    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args){
        MathOperations operations = new MathOperations();
        int sumInt = operations.add(50, 80);
        System.out.println("Sum of two integers: " + sumInt);
        double sumDouble = operations.add(15.5, 25.62, 20.43);
        System.out.println("Sum of three doubles: " + sumDouble);
        String concatenatedString = operations.add("Hi, ", "Welcome to java class");
        System.out.println("Concatenation of two strings: " + concatenatedString);
    }
}