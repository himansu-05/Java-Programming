package com.practice.math;

public class PrimeDigitsInNumber {
    public static void main(String[] args) {
        int n = 1324576;
        int result = sumEvenDigits(n);
        System.out.println(result);
    }

    private static int sumEvenDigits(int n) {
        int count = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp == 2 || temp == 3 || temp == 5 || temp == 7) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
