package com.practice.math;

public class EvenNumber {
    public static void main(String[] args) {
        int n = 1;
        if(isEven(n)){
            System.out.println(n + " is a even no.");
        }else {
            System.out.println(n+ " is not a even no.");
        }
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
