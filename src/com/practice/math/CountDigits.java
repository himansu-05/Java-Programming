package com.practice.math;

public class CountDigits {
    public static void main(String[] args) {
        int  n = 1233123;
        int result = countDigits(n);
        System.out.println(result);
    }

    private static int countDigits(int n) {
//        int count = (int)(Math.log10(n) + 1);
        int count = 0;
        while (n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
}
