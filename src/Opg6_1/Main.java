package Opg6_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPentagonalNumber(1));
    }

    public static int getPentagonalNumber(int n) {
        for (int i = 1; i <= 100; i++) {
            int result = n * (3 * n - 1)/2;
            if (i % 10 == 0) {
                System.out.println(result);
            } else
                System.out.print(result + " ");
            n++;

        }
        return n;


    }

}

