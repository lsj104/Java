package com.test.question;

import java.util.Scanner;

public class Q059 {
    public static void main(String[] args) {
        //배열:역순

        int[] nums = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.print("숫자:");
            nums[i] = scanner.nextInt();
        }

        for (int i = nums.length - 1; i >= 0; --i) {
            System.out.printf("nums[%d] = %d\n", i, nums[i]);
        }


    }
}
