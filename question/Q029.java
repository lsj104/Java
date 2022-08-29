package com.test.question;

import java.util.Scanner;

public class Q029 {
    public static void main(String[] args) {

        //조건문:연산식

        int num1 = 0;
        int num2 = 0;
        String oper = "";

        Scanner num1scan = new Scanner(System.in);
        System.out.print("첫번째 숫자:");
        num1 = num1scan.nextInt();


        Scanner num2scan = new Scanner(System.in);
        System.out.print("두번째 숫자:");
        num2 = num2scan.nextInt();

        Scanner operscan = new Scanner(System.in);
        System.out.print("연산자:");
        oper = operscan.nextLine();

        if (oper.equals("+")){
            System.out.printf("%d %s %d = %d", num1,oper,num2,num1+num2);
        } else if (oper.equals("-")) {
            System.out.printf("%d %s %d = %d", num1,oper,num2,num1-num2);
        } else if (oper.equals("*")) {
            System.out.printf("%d %s %d = %d", num1,oper,num2,num1*num2);
        } else if (oper.equals("/")) {
            System.out.printf("%d %s %d = %.1f", num1,oper,num2,(float)num1/num2);
        } else if (oper.equals("%")) {
            System.out.printf("%d %s %d = %d", num1,oper,num2,num1%num2);
        }else {
            System.out.println("연산이 불가능합니다.");
        }
    }
}
