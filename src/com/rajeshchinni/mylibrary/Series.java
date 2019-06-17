package com.rajeshchinni.mylibrary;

public class Series {

    public static long nSum(int n){
        return (n * (n + 1)) / 2 ;
    }

    public static long factorial(int n){
        if (n == 0){
            return 1;
        }

        long num = 1;
        for (int i =1; i<= n; i++){
            num = num * i;
        }
        return num;
    }

    public static long fibonacci(int n){
        if (n <= 1){
            return n;
        }

        long num1st = 0;
        long num2nd = 1;
        long total = 0;
        for (int i =1; i < n; i++){
            total = num1st + num2nd;
            num1st = num2nd;
            num2nd = total;
        }
        return total;

    }
}
