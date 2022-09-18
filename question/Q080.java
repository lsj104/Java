package com.test.question;

import java.util.Scanner;

public class Q080 {
    public static void main(String[] args) {
        //주민등록번호 유효성 검사
        //1.각 자리에 2,3,4,5,6,7,8,9,2,3,4,5를 곱한다(마지막 자리 제외)
        //2.각 자리의 숫자를 모두 더한다
        //3.11로 나눈 나머지 값을 구함
        //4.11에서 결과 값을 뺌 (마지막 결과가 두자리인 경우 다시 10으로 나눈 나머지 값을 구함
        //5.결과가 주민등록번호 마지막 자리와 일치하면 유효한 번호

        String jumin = "";
        int sum = 0;
        int[] temp = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int total = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("주민등록번호:");
        jumin = scan.nextLine();
        jumin = jumin.replace("-", ""); //'-'의 입력 유무 상관없이 검사

        for (int i = 0; i < 12; i++) { //1,2번
            sum += temp[i] * Integer.parseInt(jumin.substring(i, i + 1));
        }

        total = 11 - sum % 11; //4번
        if (total >= 10) { //마지막 결과가 두자리인 경우 다시 10으로 나눈 나머지 값을 구함
            total = total % 10;
        }

        if (total == Integer.parseInt(jumin.substring(12))) {
            System.out.println("올바른 주민등록번호 입니다.");
        } else {
            System.out.println("올바르지 않은 주민등록번호 입니다.");
        }


    }
}
