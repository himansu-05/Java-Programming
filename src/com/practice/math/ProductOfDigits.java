package com.practice.math;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1324;
        int result = proDigits(n);
        System.out.println(result);
    }

    private static int proDigits(int n) {
        int pro = 1;
        while (n > 0){
            int temp = n % 10;
            pro *= temp;
            n /= 10;
        }
        return pro;
    }
}
