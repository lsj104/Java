package com.test.question;

import java.util.Scanner;

public class Q036 {
    public static void main(String[] args) {
        //반복문: 숫자범위

        int start = 0;
        int end = 0;
        int add = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 숫자:");
        start = scanner.nextInt();

        System.out.print("종료 숫자:");
        end = scanner.nextInt();

        System.out.print("증감치:");
        add = scanner.nextInt();

        for (int i=start; i<=end; i+=add){
            System.out.println(i);
        }

    }
}
