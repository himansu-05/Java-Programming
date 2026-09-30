package com.practice.math;

public class SpyNumber {
    public static void main(String[] args) {
        int  n = 1124;
        if(isSpy(n)){
            System.out.println("Spy Number");
        }else {
            System.out.println("Not a Spy Number");
        }
    }

    private static boolean isSpy(int n) {
        int sum = 0, pro = 1;
        while (n > 0){
            int temp = n % 10;
            sum += temp;
            pro *= temp;
            n /= 10;
        }
        return sum == pro;
    }
}
