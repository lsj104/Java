package com.test.question;

import java.util.Scanner;

public class Q014 {

    //지하철

    public static void main(String[] args) {
        Scanner stationscan = new Scanner(System.in);
        System.out.print("역의개수:");
        int station = stationscan.nextInt();

        Scanner changescan = new Scanner(System.in);
        System.out.print("환승역의 횟수:");
        int change = changescan.nextInt();

        Scanner timescan = new Scanner(System.in);
        System.out.printf("시간대(1.평상시, 2.출근시, 3.퇴근시):");
        int time = timescan.nextInt();

        System.out.printf("총 소요 시간은 %d분입니다.", getTime(station,change,time));

    }//main

    public static int getTime(int station, int change, int time){
        int sum = 0;
        sum = station * 2 + change * ((time == 1)? 3: (time == 2)?4:5);
        return sum;
    }




}
