package com.test.question;

import java.util.Scanner;

public class Q033 {
    public static void main(String[] args) {

        //조건문: 윤년 검사

        int year = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("년도 입력:");
        year = scanner.nextInt();

        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.printf("%d년은 '윤년'입니다.", year);
        } else {
            System.out.printf("%d년은 '평년'입니다.", year);
        }
    } //main
}
