package com.test.question;

import java.util.Arrays;
import java.util.Random;

public class Q062 {
    public static void main(String[] args) {
        //배열: 최대 최소
        int[] num = new int[20];
        Random randomd = new Random();

        for (int i = 0; i < num.length; i++) { //20개 난수 생성
            num[i] = randomd.nextInt(20) + 1;
        }


        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }
        System.out.println();


        Arrays.sort(num); //배열 정렬
        System.out.println("최댓값:" + num[num.length - 1]);
        System.out.println("최솟값:" + num[0]);


    }
}
