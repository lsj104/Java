package com.test.question;

public class Q008 {

    //메소드: 인삿말

    public static void main(String[] args) {
        hello();
        introduce("홍길동");
        bye();

    }//main

    public static void hello() {
        System.out.println("안녕하세요.");
    }//hello

    public static void introduce(String name) {
        System.out.println("저는" + name + "입니다.");
    }

    public static void bye() {
        System.out.println("안녕히가세요.");
    }

}
