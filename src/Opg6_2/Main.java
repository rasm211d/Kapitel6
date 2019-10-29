package Opg6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        long number = input.nextLong();

        System.out.println("The sum of every single number in your integer is = " + sumDigits(number));

    }
    public static long sumDigits (long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;

        }
        return sum;
    }

}
