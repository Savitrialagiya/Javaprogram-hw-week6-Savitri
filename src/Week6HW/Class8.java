package Week6HW;

import java.util.Scanner;

/**Write a program to calculate the area of a triangle.
 */
public class Class8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the width of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("enter the height of the triangle:");
        double height = scanner.nextDouble();

        //Area = (width*height)/2
        double area = (base*height)/2;
        System.out.println("Area of Triangle is: " + area);
        scanner.close();

    }
}
