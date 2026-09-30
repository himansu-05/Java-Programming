package com.practice.math;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12213;
        int result = sumDigits(n);
        System.out.println(result);
    }

    private static int sumDigits(int n) {
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }
        return sum;
    }
}
