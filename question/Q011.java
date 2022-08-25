package com.test.question;

import java.util.Scanner;

public class Q011 {

    public static void main(String[] args) {
        // 연산식

        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자:");
        int n1 = scan.nextInt();

        Scanner secondscan = new Scanner(System.in);
        System.out.print("두번째 숫자:");
        int n2 = secondscan.nextInt();

        System.out.printf("%d + %d = %d\n", n1,n2,add(n1,n2));
        System.out.printf("%d - %d = %d\n", n1,n2,subtract(n1,n2));
        System.out.printf("%d * %d = %d\n", n1,n2,multiply(n1,n2));
        System.out.printf("%.0f / %.0f = %.1f\n", (float)n1,(float)n2,divide(n1,n2));
        System.out.printf("%d %% %d = %d\n", n1,n2,mod(n1,n2));





    } //main

    public static int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    } //add

    public static int subtract(int n1, int n2){
        int result = n1 - n2;
        return result;
    }

    public static int multiply(int n1, int n2){
        int result = n1 * n2;
        return result;
    }
    public static float divide(float n1, float n2){
        float result = n1 / n2;
        return result;
    }

    public static int mod(int n1, int n2){
        int result = n1 % n2;
        return result;
    }

}
