package com.practice.math;

public class PerfectNo {
    public static void main(String[] args) {
        int n = 6;
        if(isPerfect(n)){
            System.out.println("Perfect No");
        }else{
            System.out.println("Not a Perfect No");
        }

    }

    private static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        return n == sum;
    }
}
