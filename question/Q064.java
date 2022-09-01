package com.test.question;

import java.util.Arrays;
import java.util.Random;

public class Q064 {
    public static void main(String[] args) {
        //배열: 로또

        int[] num = new int[6];
        Random randomd = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = randomd.nextInt(45) + 1;
            for (int j = 0; j < i; j++) { //중복제거
                if (num[i] == num[j]) {
                    i--;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(num));

    }
}
