package com.practice.math;

public class PrimeNoOrNot {
    public static void main(String[] args) {
        int n = 3;
        if (isPrime(n)){
            System.out.println("Prime No");
        }else {
            System.out.println("Not a Prime No");
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= n/2 ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
