package com.test.question;

import java.util.Scanner;

public class Q030 {
    public static void main(String[] args) {

        //조건문:대소문자 변환

        //A코드값:65, Z코드값:90, a코드값:97, z코드값:122

        String letter = "";
        int code = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자:");
        letter = scanner.nextLine();
        code = letter.charAt(0);

        char small = (char) (code+32); //대문자 코드값 + 32 =  소문자 코드값
        char cap = (char) (code-32); //소문자 코드값 - 32 = 대문자코드값

        if (code>=65 && code<=90){
            System.out.printf("'%s'의 소문자는 '%s'입니다.", letter,small );
        } else if (code>=97 && code<=122) {
            System.out.printf("'%s'의 대문자는 '%s'입니다.", letter,cap );
        } else {
            System.out.println("영문자만 입력하시오.");
        }


    }
}
