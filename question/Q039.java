package com.test.question;

import java.util.Scanner;

public class Q039 {
    public static void main(String[] args) {
        //반복문: 숫자 합

        int startnum = 0;
        int endnum = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("시작 숫자:");
        startnum = scanner.nextInt();
        System.out.print("종료 숫자:");
        endnum = scanner.nextInt();

        for (int i=startnum; i<=endnum; i++){ //시작숫자부터 종료숫자까지의 합계 구하기
            sum += i;
        }

        for (int i=startnum; i<endnum; i++ ){ //시작숫자부터 종료숫자 전까지 숫자 + 출력

            System.out.printf("%d + ", i);
        }

        System.out.printf("%d = %d", endnum,sum); //종료숫자 = 합계 출력




    }
}
