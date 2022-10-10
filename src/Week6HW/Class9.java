package Week6HW;

import java.util.Scanner;

//Write a program to convert the upper case to lower case.
public class Class9 {

    public static void main(String[] args) {
        char chUpper, chLower;
        int ascii;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character in uppercase: ");
        chUpper = scan.next().charAt(0);
        ascii = chUpper;
        ascii = ascii + 32;
        chLower = (char) ascii;
        System.out.println("\nEquivalent Character in Lowercase = " + chLower);

    }
}
