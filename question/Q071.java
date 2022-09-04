package com.test.question;

public class Q071 {
    public static void main(String[] args) {
        //배열:숫자출력 4

        int[][] nums = new int[5][5];
        int n = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length - i; j++) {
                nums[i][j] = n;
                n++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.printf("%3d", nums[i][j]);
            }
            System.out.println();
        }

    }
}
