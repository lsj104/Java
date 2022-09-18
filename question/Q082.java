package com.test.question;

import java.util.Scanner;

public class Q082 {
    public static void main(String[] args) {
        //문자열: 합성어

        String word = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("단어:");
        word = scan.nextLine();

        System.out.print("결과:");


        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (c > 'A' && c <= 'Z' && i != 0) {
                System.out.print(" ");
            }
            System.out.print(c);
        }

    }
}
