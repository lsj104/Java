package com.test.question;

import java.util.Scanner;

public class Q028 {
    public static void main(String[] args) {

        int year = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("근무 년수:");
        year = scanner.nextInt();

        if (year >= 1){
            if (year <=4 ){
                System.out.printf("%d년차 초급 개발자 입니다.\n앞으로 %d년 더 근무를 하면 중급 개발자가 됩나다.",year, 5-year);
            } else if (year <=9 ) {
                System.out.printf("%d년차 중급 개발자입니다.\n당신은 %d년전까지 초급 개발자였습니다.\n앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.", year, year-4, 10-year);
            } else if (year >=10 ){
                System.out.printf("%d년차 고급 개발자입니다.\n당신은 %d년전까지 중급 개발자였습니다.", year, year-9);
            }

        } else {
            System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
        }
    }
}
