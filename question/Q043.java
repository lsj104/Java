package com.test.question;

import java.util.Scanner;

public class Q043 {
    public static void main(String[] args) {
        //반복문: 숫자 게임

        int answer = 0;
        answer = (int) (Math.random() * 10) + 1; // 1-10사이의 숫자
        int userAnswer = 0;
        int count = 0;

        System.out.println("답" + answer);

        System.out.println("컴퓨터가 1-10 사이의 숫자를 1개 생각했습니다.");
        for (int i = 1; i <= 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("숫자:");
            userAnswer = scanner.nextInt();
            if (userAnswer != answer) {
                System.out.println("틀렸습니다.");
                count++;
                if (count == 10) {
                    System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", answer);
                    System.out.printf("모든 기회를 실패했습니다.\n");
                    System.out.printf("프로그램을 종료합니다.");
                }
            } else {
                count++;
                System.out.println("맞았습니다.");
                System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", answer);
                System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", count);
                System.out.printf("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
