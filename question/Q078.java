package com.test.question;

import java.util.Scanner;

public class Q078 {
    public static void main(String[] args) {
        //확장자

        int mp3 = 0;
        int jpg = 0;
        int java = 0;
        int hwp = 0;
        int doc = 0;
        String file = "";
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("파일명:");
            file = scan.nextLine();

            if (file.endsWith(".mp3")) {
                mp3++;
            } else if (file.endsWith(".jpg")) {
                jpg++;
            } else if (file.endsWith(".java")) {
                java++;
            } else if (file.endsWith(".hwp")) {
                hwp++;
            } else if (file.endsWith(".doc")) {
                doc++;
            }
        }


        System.out.printf("mp3:%d개\n", mp3);
        System.out.printf("jpg:%d개\n", jpg);
        System.out.printf("java:%d개\n", java);
        System.out.printf("hwp:%d개\n", hwp);
        System.out.printf("doc:%d개\n", doc);
    }
}
