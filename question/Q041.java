package com.test.question;

public class Q041 {
    public static void main(String[] args) {

        //반복문: 숫자합

        int sum = 0;
        int num = 0;

        for (int i=1; ; i++) {
            sum += i;
            if (sum >= 1000) { //합계가 1000을 넘어가는 순간 종료
                num = i;
                break;
            }

        }


        for (int i=1; i<num; i++ ){ //시작숫자부터 종료숫자 전까지 숫자 + 출력

            System.out.printf("%d + ", i);
        }

        System.out.printf("%d = %d", num,sum); //종료숫자 = 합계 출력


    } //main
}
