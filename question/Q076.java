package com.test.question;

import java.util.Scanner;

public class Q076 {
    public static void main(String[] args) {
        // 문자열: 이메일
        Scanner scan = new Scanner(System.in);
        System.out.print("이메일:");
        String email = scan.nextLine();

        String id = email.substring(0, email.indexOf("@")); //0부터 @전까지 추출
        System.out.printf("아이디:%s\n", id);

        String domain = email.substring(email.indexOf("@") + 1); //@다음부터 끝까지 추출
        System.out.printf("도메인:%s", domain);
    }
}
