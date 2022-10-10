package Week6HW;

import java.util.Scanner;

/**Write a program to enter any radius value of the circle and find out the
 area.(Formula of Area A=PI*r*r)
 */
public class Class6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius *radius);
        System.out.println("The area of the circle is : " + area);
        scanner.close();

    }
}
