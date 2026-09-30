package com.practice.math;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 40585;
        if (isStrong(n)){
            System.out.println("Strong Number");
        }else {
            System.out.println("Not a Strong Number");
        }
    }

    private static boolean isStrong(int n) {
        int sum = 0;
        int num = n;
        while (n > 0){
            int temp = n % 10;
            sum += factorial(temp);
            n /= 10;
        }
        return num == sum;
    }

    private static int factorial(int n){
        int pro = 1;
        for (int i = 1; i <= n ; i++) {
            pro *= i;
        }
        return pro;
    }

}
