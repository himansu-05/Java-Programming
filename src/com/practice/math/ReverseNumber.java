package com.practice.math;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 9128;
        int result = reverse(n);
        System.out.println(result);
    }

    private static int reverse(int n) {
        int rev = 0;
        while (n > 0){
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        return rev;
    }

}
