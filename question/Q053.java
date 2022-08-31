package com.test.question;

public class Q053 {
    public static void main(String[] args) {
        //반복문:구구단

        for (int i = 1; i <= 9; i++) {

            for (int j = 2; j <= 5; j++) { //2단 - 5단
                System.out.printf(" %2d * %2d = %2d", j, i, i * j);
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 1; i <= 9; i++) {

            for (int j = 6; j <= 9; j++) { //6단 - 9단
                System.out.printf(" %2d * %2d = %2d", j, i, i * j);
            }
            System.out.println();

        }
    }
}
