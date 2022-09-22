package com.test.question;

import java.util.Scanner;

public class Q085 {
    public static void main(String[] args) {
        //문자열: 숫자합

        String txt = "";
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("입력:");
        txt = scan.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c > '0' && c <= '9') {
                sum += c - 48; //아스키코드 48
            }
        }

        System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", sum);
    }
}
