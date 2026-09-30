package com.practice.math;

public class SumOfEvenDigits {
    public static void main(String[] args) {
        int n = 132456;
        int result = sumEvenDigits(n);
        System.out.println(result);
    }

    private static int sumEvenDigits(int n) {
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            if(temp % 2 == 0){
                sum += temp;
            }
            n /= 10;
        }
        return sum;
    }
}
