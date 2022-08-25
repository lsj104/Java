package com.test.question;

import java.util.Scanner;

public class Q012 {

    public static void main(String[] args) {
        // 짝수 홀수
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자:");
        int n = scan.nextInt();
        System.out.printf("입력하신 숫자 '%d'는(은)'%s'입니다.\n", n, getNumber(n));




    } //main

    public static String getNumber(int n){
        String result = "";

        result = (n%2 == 0)? "짝수" : "홀수";
        return result;

    }




}
