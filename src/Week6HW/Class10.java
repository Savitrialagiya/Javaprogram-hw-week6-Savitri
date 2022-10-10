package Week6HW;

import java.util.Scanner;
/**Write a Java program that takes a number as input and prints its
 multiplication table up to 10
 * */
public class Class10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = in .nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(n + "*" + i + "=" + (n*i));
        }
    }
}
