package Week6HW;

import java.util.Scanner;

/**Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Class7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();

        double celcius = ((5*(Fahrenheit - 32.0))/9.0);
        System.out.println(Fahrenheit + "degree Fahrenheit is equal to" + celcius + "in Celsius");
        scanner.close();

    }
}
