package Week6HW;

import java.util.Scanner;

/**Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
 */
public class Class19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Input a string: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
