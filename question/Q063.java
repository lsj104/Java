package com.test.question;

import java.util.Random;
import java.util.Scanner;

public class Q063 {
    public static void main(String[] args) {
        //배열:최대 최소

        int max = 0;
        int min = 0;

        int[] num = new int[20];
        Random randomd = new Random();

        for (int i = 0; i < num.length; i++) { //20개 난수 생성
            num[i] = randomd.nextInt(20) + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("최대 범위:");
        max = scanner.nextInt();
        System.out.print("최소 범위:");
        min = scanner.nextInt();

        System.out.print("원본:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }
        System.out.println();

        System.out.print("결과:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= min && num[i] <= max) {
                System.out.print(num[i] + ",");
            }
        }


    }
}
