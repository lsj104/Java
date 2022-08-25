package com.test.question;

import java.util.Scanner;

public class Q015 {
    public static void main(String[] args) {
        //사과나무
        Scanner sunnyscan = new Scanner(System.in);
        System.out.print("맑은날:");
        int sunny = sunnyscan.nextInt();

        Scanner foggyscan = new Scanner(System.in);
        System.out.print("흐린날:");
        int foggy = foggyscan.nextInt();

        System.out.printf("사과가 총 %d개 열렸습니다.",getApple(sunny,foggy));


    }

    public static int getApple(int sunny, int foggy){
        int apple = 0;
        int hei = 0;
        hei = sunny*5 +  foggy*2;
        apple = hei >= 100? (hei-100)/10 : 0;
    return apple;
    }
}
