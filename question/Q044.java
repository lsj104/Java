package com.test.question;

import java.util.Scanner;

public class Q044 {
    public static void main(String[] args) {

        int sum = 0;
        int num = 0;
        String output = "";

        for (; sum <= 100; sum += num) { //합계가 100을 넘어가는 순간 종료
            Scanner scanner = new Scanner(System.in);
            System.out.print("숫자: ");
            num = scanner.nextInt();

            if (num % 2 == 1) { // 홀수일 때
                output = output + " - " + num;
                num *= -1;
                continue;
            }
            output = output + " + " + num; // 짝수일 때
        }
        output = output + " = " + sum;
        System.out.printf(output); //= 합계 출력
    }

}
