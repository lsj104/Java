package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
    public static void main(String[] args) {
        //날짜시간: 아빠와 딸

        Scanner dyearscan = new Scanner(System.in); //아빠 생일 년 입력
        System.out.print("아빠 생일(년):");
        int dyear = dyearscan.nextInt();

        Scanner dmonthscan = new Scanner(System.in); //아빠 생일 월 입력
        System.out.print("아빠 생일(월):");
        int dmonth = dmonthscan.nextInt();

        Scanner ddatescan = new Scanner(System.in); //아빠 생일 일 입력
        System.out.print("아빠 생일(일):");
        int ddate = ddatescan.nextInt();

        Calendar dad = Calendar.getInstance();
        dad.set(dyear,dmonth-1,ddate);

        Scanner yearscan  =  new Scanner(System.in); //딸 생일 년 입력
        System.out.print("딸 생일(년):");
        int year = yearscan.nextInt();

        Scanner monthscan  =  new Scanner(System.in); //딸 생일 월 입력
        System.out.print("딸 생일(월):");
        int month = monthscan.nextInt();

        Scanner datescan  =  new Scanner(System.in); //딸 생일 일 입력
        System.out.print("딸 생일(일):");
        int date = datescan.nextInt();

        Calendar doughter = Calendar.getInstance();
        doughter.set(year,month-1,date);

        long gap = doughter.getTimeInMillis() - dad.getTimeInMillis();

        System.out.printf("아빠는 딸보다 총%,d일을 더 살았습니다.", gap / 1000/ 60/ 60/ 24);



    }
}
