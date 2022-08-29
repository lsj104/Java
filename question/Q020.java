package com.test.question;

import java.util.Calendar;

public class Q020 {
    public static void main(String[] args) {
        //날짜시간: 백일 첫돌
        birth();
    }//main

    public static void birth(){
        Calendar birth = Calendar.getInstance();
        birth.add(Calendar.DATE, 100);
        System.out.printf("백일: %tF\n", birth);

        Calendar year = Calendar.getInstance();
        birth.add(Calendar.YEAR,1);
        System.out.printf("첫돌: %tF\n", year);
    }
}
