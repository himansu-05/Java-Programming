package com.practice.math;

public class CountDivisorsOfNo {
    public static void main(String[] args) {
        int count = 1, n = 10;
        for (int i = 1; i <= n /2; i++) {
            if (n % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
