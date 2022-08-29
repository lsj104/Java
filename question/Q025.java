package com.test.question;

import java.util.Scanner;

public class Q025 {
    public static void main(String[] args) {
        //조건문: 숫자비교

        int num1 = 0;
        int num2 = 0;

        Scanner num1scan = new Scanner(System.in);
        System.out.print("첫번째 숫자:");
        num1 = num1scan.nextInt();

        Scanner num2scan = new Scanner(System.in);
        System.out.print("두번째 숫자:");
        num2 = num2scan.nextInt();

        if (num1>num2){
            System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", num1,num2,num1-num2);
        } else if (num2>num1){
            System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", num2,num1,num2-num1);
        } else {
            System.out.println("두 숫자는 동일합니다.");
        }

    }
}
