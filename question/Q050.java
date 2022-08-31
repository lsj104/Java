package com.test.question;

import java.util.Scanner;

public class Q050 {
    public static void main(String[] args) {
        //반복문:별찍기2

        int count = 0;
        int i = 0, j = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("행:");
        count = scanner.nextInt();

        for (i = 1; i <= count; i++) { //행
            for (j = 0; j < count - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
