package com.test.question;

import java.util.Scanner;

public class Q027 {
    public static void main(String[] args) {
        //조건문: 문자조건

        String word = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자:");
        word = scanner.nextLine();

        if ((word.equals("f")) || (word.equals("F"))){
            System.out.println("Father");
        } else if ((word.equals("m") || (word.equals("M")))) {
            System.out.println("Mother");
        } else if ((word.equals("s")) || (word.equals("S"))) {
            System.out.println("Sister");
        } else if ((word.equals("b")) || (word.equals("B"))) {
            System.out.println("Brother");
        }else {
            System.out.println("입력한 문자가 올바르지 않습니다.");
        }

    }
}
