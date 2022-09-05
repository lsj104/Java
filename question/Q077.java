package com.test.question;

import java.util.Scanner;

public class Q077 {
    public static void main(String[] args) {
        //문자열: 숫자합

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자:");
        String num = scan.nextLine();
        int sum = 0;
        String result = "";

        StringBuffer sb = new StringBuffer(); //숫자 사이에 +를 넣기위해 StringBuffer 클래스 이용
        sb.append(num); //문자열 추가

        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(num.substring(i, i + 1));

        }

        for (int i = 0; i < num.length() + 1; i++) {
            if (i % 2 == 1) { //index가 홀수일때 + 추가
                sb.insert(i, "+");
            }


        }

        System.out.printf("결과:%s=%d", sb, sum);
    }
}
