package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
    public static void main(String[] args) {
        //날짜시간: 나이
        Scanner scan = new Scanner(System.in);
        System.out.print("태어난 년도:");
        int year = scan.nextInt();

        Calendar now = Calendar.getInstance();
        int age = now.get(Calendar.YEAR) - year +1;
        System.out.printf("나이:%d세", age);
    }


}
