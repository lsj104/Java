package com.test.question;

import java.util.Scanner;

public class Q013 {
    //성적처리

    public static void main(String[] args) {
        Scanner korscan = new Scanner(System.in);
        System.out.print("국어:");
        int kor = korscan.nextInt();

        Scanner engscan = new Scanner(System.in);
        System.out.print("영어:");
        int eng = engscan.nextInt();

        Scanner mathscan = new Scanner(System.in);
        System.out.print("수학:");
        int math = mathscan.nextInt();

        String result = test(kor, eng, math);
        System.out.printf("%s\n", result);


    }

    public static String test(int kor, int eng, int math) {
        String result = "";

        result = ((kor + eng + math) / 3.0 > 60)? "합격입니다" : "불합격입니다.";
        result = (kor < 40 || eng < 40 || math <40) ? "불합격입니다." : result;
        return result;
    }

}
