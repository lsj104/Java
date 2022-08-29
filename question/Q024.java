package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {
    public static void main(String[] args) {
        //날짜시간: 배달전화


        System.out.println("음식을 받기 원하는 시각");
        Scanner hourscan = new Scanner(System.in);
        System.out.print("시:");
        int hour = hourscan.nextInt();


        Scanner minscan = new Scanner(System.in);
        System.out.print("분:");
        int min = minscan.nextInt();



        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY,hour);
        now.set(Calendar.MINUTE, min);

        now.add(Calendar.MINUTE, -10);//짜장면
        System.out.printf("짜장면: %d시%d분\n",now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE) );

        now.add(Calendar.MINUTE, -8); //치킨
        System.out.printf("치킨: %d시%d분\n",now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));

        now.add(Calendar.MINUTE, -7); //피자
        System.out.printf("피자: %d시%d분\n",now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));



    }
}
