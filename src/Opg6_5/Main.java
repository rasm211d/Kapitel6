package Opg6_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers with a space in between: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers (double num1, double num2, double num3) {
        if (num1 / num2 >= 1 && num1 / num3 >= 1) {
            if (num2 / num3 >= 1) {
                System.out.println(num1 + " " + num2 + " " + num3);
            }
            if (num3 / num2 >= 1) {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        }
        if (num2 / num1 >= 1 && num2 / num3 >= 1) {
            if (num1 / num3 >= 1) {
                System.out.println(num2 + " " + num1 + " " + num3);
            }
            if (num3 / num1 >= 1) {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        }
        if (num3 / num1 >= 1 && num3 / num2 >= 1) {
            if (num2 / num1 >= 1) {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
            if (num1 / num2 >= 1) {
                System.out.println(num3 + " " + num1 + " " + num2);
            }
        }

    }
}
