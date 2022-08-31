package com.test.question;

import java.util.Scanner;

public class Q051 {
    public static void main(String[] args) {
        //반복문: 별찍기3

        int count = 0;
        int i = 0, j = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("행:");
        count = scanner.nextInt();

        for (i = 1; i <= count; i++) {
            for (j = 0; j < count - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
