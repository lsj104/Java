package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {
    public static void main(String[] args) {
        //날짜시간: 커플 기념일

        Scanner person1 = new Scanner(System.in);
        System.out.print("남자이름:");
        String name1 = person1.nextLine();

        Scanner person2 = new Scanner(System.in);
        System.out.print("여자이름:");
        String name2 = person2.nextLine();

        Scanner yearscan = new Scanner(System.in);
        System.out.print("만난날(년):");
        int year = yearscan.nextInt();

        Scanner scanmonth = new Scanner(System.in);
        System.out.print("만난날(월):");
        int month = scanmonth.nextInt();

        Scanner scandate = new Scanner(System.in);
        System.out.print("만난날(일):");
        int date = scandate.nextInt();

        Calendar now = Calendar.getInstance();
        now.set(year,month-1,date);

        System.out.printf("'%s'과(와) '%s'의 기념일\n", name1, name2);

        now.add(Calendar.DATE,100);
        System.out.printf("100일:%tF\n", now);

        now.add(Calendar.DATE,100);
        System.out.printf("200일:%tF\n", now);

        now.add(Calendar.DATE,100);
        System.out.printf("300일:%tF\n", now);

        now.add(Calendar.DATE,200);
        System.out.printf("500일:%tF\n", now);

        now.add(Calendar.DATE,500);
        System.out.printf("1000일:%tF\n", now);


    }
}
