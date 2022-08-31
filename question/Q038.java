package com.test.question;

import java.util.Scanner;

public class Q038 {
    public static void main(String[] args) {
        //반복문: 짝수 홀수 합

        int count = 0;
        int num = 0;
        int evencount = 0;
        int oddcount = 0;
        int evensum = 0;
        int oddsum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 횟수:");
        count = scanner.nextInt();

        for (int i=1; i<=count; i++){
            System.out.print("숫자: ");
            num = scanner.nextInt();

            if (num%2==0){
                evencount++;
                evensum += num;
            } else {
                oddcount++;
                oddsum +=num;
            }

        }

        System.out.printf("짝수 %d개의 합:%d\n", evencount, evensum);
        System.out.printf("홀수 %d개의 합:%d", oddcount, oddsum);
    }
}
