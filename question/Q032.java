package com.test.question;

import java.util.Scanner;

public class Q032 {
    public static void main(String[] args) {

        //조건문:주차요금

        int inhour = 0;
        int inmin = 0;
        int outhour = 0;
        int outmin = 0;
        long gap = 0;
        long fee = 0;
        int in = 0;
        int out = 0;

        System.out.println("[들어온 시간]");
        Scanner inhourscan = new Scanner(System.in);
        System.out.print("시:");
        inhour = inhourscan.nextInt();
        Scanner inminscan = new Scanner(System.in);
        System.out.print("분:");
        inmin = inminscan.nextInt();

        System.out.println("[나간 시간]");
        Scanner outhourscan = new Scanner(System.in);
        System.out.print("시:");
        outhour = outhourscan.nextInt();
        Scanner outminscan = new Scanner(System.in);
        System.out.print("분:");
        outmin = outminscan.nextInt();

        in = inhour * 60 + inmin;
        out = outhour * 60 + outmin;

        gap = out - in;
        fee = ((gap-30)/10) *2000;
        System.out.printf("주차 요금은 %,d원입니다.", fee);









    }
}
