package Opg6_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        reverse(number);

    }
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();

    }

}
