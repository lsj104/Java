package com.test.question;

import java.util.Scanner;

public class Q075 {
    public static void main(String[] args) {
        //문자열:역순출력

        Scanner scan = new Scanner(System.in);
        System.out.print("문장 입력:");
        String txt = scan.nextLine();

        for (int i = txt.length() - 1; i >= 0; i--) {
            System.out.print(txt.charAt(i));
        }

    }
}
