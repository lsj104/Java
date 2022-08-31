package com.test.question;

import java.util.Scanner;

public class Q037 {
    public static void main(String[] args) {
        //반복문: 범위 합

        int num = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자:");
        num = scanner.nextInt();

        for (int i=0; i<=num; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
