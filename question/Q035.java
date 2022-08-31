package com.test.question;

import java.util.Scanner;

public class Q035 {
    public static void main(String[] args) {
        //반복문: 반복인사

        String name = "";
        int count = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("이름:");
        name = scanner.nextLine();
        System.out.print("횟수:");
        count = scanner.nextInt();

        for (int i=1; i<=count; i++){
            System.out.printf("%s님 안녕하세요~\n", name);
        }

    }
}
