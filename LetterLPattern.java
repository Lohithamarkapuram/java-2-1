//8) Write a Java Program to Print first letter of your name (Use Scanner class & loop
import java.util.Scanner;

public class LetterLPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the letter 'L': ");
        int size = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < size; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < size; i++) {
            System.out.print("* ");
        }
    }
}
