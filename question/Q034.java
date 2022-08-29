package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
    public static void main(String[] args) {

        //조건문:날짜계산

        int year = 0;
        int month = 0;
        int date = 0;
        String result = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("년:");
        year = scanner.nextInt();

        System.out.print("월:");
        month = scanner.nextInt();

        System.out.print("일:");
        date = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,date);

        if (calendar.get(Calendar.DAY_OF_WEEK)!=1 && calendar.get(Calendar.DAY_OF_WEEK)!=7){
            System.out.println("입력하신 날짜는 '평일'입니다.");
            System.out.println("해당 주의 토요일로 이동합니다.");

            calendar.add(Calendar.DATE,7 - calendar.get(Calendar.DAY_OF_WEEK));

            System.out.printf("이동한 날짜는 '%tF' 입니다.\n", calendar);
        } else {
            System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
            System.out.println("결과가 없습니다.");
        }


    }
}
