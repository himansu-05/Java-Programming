package com.practice.math;

public class FindNToThePowerP {
    public static void main(String[] args) {
        int n = 5, p = 3;
        int result = power(n, p);
        System.out.println(result);
    }
    private static int power(int n, int p){
        int pow = 1;
        for (int i = 1; i <= p; i++) {
            pow *= n;
        }
        return pow;
    }
}
