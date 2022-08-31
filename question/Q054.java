package com.test.question;

public class Q054 {
    public static void main(String[] args) {
        //반복문: 소수

        int i = 0, j = 0;

        for (i = 2; i <= 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(i + ",");
            }
        }
    }
}
