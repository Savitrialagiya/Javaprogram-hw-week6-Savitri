package Week6HW;

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
            Addition();
            Subtraction();
            Class5 obj = new Class5();
            obj.multiplication();
            obj.division();
        }
    public static void Addition() {

        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        int c = a + b;
        System.out.println("Addition of two numbers is : " + c);
    }

    public static void Subtraction() {

        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        x = sc.nextInt();
        System.out.println("Enter second number");
        y = sc.nextInt();
        int z = x - y;
        System.out.println("Subtraction of two numbers is : " + z);
    }
    public void multiplication() {

        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        x = sc.nextInt();
        System.out.println("Enter second number");
        y = sc.nextInt();
        int z = x * y;
        System.out.println("Multiplication of two numbers is : " + z);
    }
    public void division() {

        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        x = sc.nextInt();
        System.out.println("Enter second number");
        y = sc.nextInt();
        int z = x / y;
        System.out.println("Division of two numbers is : " + z);
    }
}
