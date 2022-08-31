package com.test.question;

public class Q057 {
    public static void main(String[] args) {
        //반복문:숫자합

        int sum = 0;
        int i = 0;

        for (i = 1; i <= 100; i++) {
            sum += i;

            if (i % 10 == 0) {
                System.out.printf("1 ~ %d: %d\n", i, sum);
            }
        }

    }
}
