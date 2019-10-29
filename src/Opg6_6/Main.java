package Opg6_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        displayPattern(n);


    }
    public static void displayPattern(int n) {
        int start = 0;
        for (start = 1; start <= n; start++) {
            System.out.print(start + " ");
        }
        start = n;
        while (start <= n) {
            start--;
            System.out.print(start + " ");
            if (start == 1) {
                break;
            }
        }
    }

}
