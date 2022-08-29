package com.test.question;

import java.util.Scanner;

public class Q031 {
    public static void main(String[] args) {

        //조건문:짝수 홀수

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        int evencount = 0;
        int oddcount = 0;

        Scanner num1scan = new Scanner(System.in);
        System.out.print("숫자입력:");
        num1 = num1scan.nextInt();

        Scanner num2scan = new Scanner(System.in);
        System.out.print("숫자입력:");
        num2 = num2scan.nextInt();

        Scanner num3scan = new Scanner(System.in);
        System.out.print("숫자입력:");
        num3 = num3scan.nextInt();

        Scanner num4scan = new Scanner(System.in);
        System.out.print("숫자입력:");
        num4 = num4scan.nextInt();

        Scanner num5scan = new Scanner(System.in);
        System.out.print("숫자입력:");
        num5 = num5scan.nextInt();

        if (num1%2==0){
            ++evencount;
        } else {
            ++oddcount;
        }

        if (num2%2==0){
            ++evencount;
        } else {
            ++oddcount;
        }

        if (num3%2==0){
            ++evencount;
        } else {
            ++oddcount;
        }

        if (num4%2==0){
            ++evencount;
        } else {
            ++oddcount;
        }

        if (num5%2==0){
            ++evencount;
        } else {
            ++oddcount;
        }

        if (evencount>oddcount){
            System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n짝수가 홀수보다 %d개 더 많습니다.", evencount,oddcount,evencount-oddcount);
        }else {
            System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n홀수가 짝수보다 %d개 더 많습니다.", evencount,oddcount,oddcount-evencount);
        }

    }
}
