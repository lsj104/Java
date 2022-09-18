package com.test.question;

import java.util.Scanner;

public class Q081 {
    public static void main(String[] args) {

        String num = "";

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자:");
        num = scan.nextLine();

        for (int i = 0; i < num.length(); i++) {
            if (i != 0 && (num.length() - i) % 3 == 0) {
                System.out.print(",");
            }
            System.out.print(num.charAt(i));
        }

    }
}
