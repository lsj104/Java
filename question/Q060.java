package com.test.question;

import java.util.Scanner;

public class Q060 {
    public static void main(String[] args) {
        //배열:이름정렬

        int count = 0;
        String name = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수:");
        count = scanner.nextInt();
        scanner.nextLine(); //엔터 제거
        String[] studentName = new String[count];


        for (int i = 0; i < studentName.length; i++) {
            System.out.print("학생명: ");
            name = scanner.nextLine();
            studentName[i] = name;
        }

        for (int i = 0; i < studentName.length - 1; i++) {
            for (int j = 0; j < studentName.length - 1 - i; j++) {
                if (studentName[j].compareTo(studentName[j + 1]) > 0) {
                    String temp = studentName[j];
                    studentName[j] = studentName[j + 1];
                    studentName[j + 1] = temp;
                }
            }
        }

        System.out.printf("입력한 학생은 총 %d명입니다.\n", count);
        for (int i = 0; i < studentName.length; i++) {
            System.out.printf("%d. %s\n", i + 1, studentName[i]);
        }


    }
}
