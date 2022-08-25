package com.test.question;

public class Q009 {

    //메소드: 고객명

    public static void main(String[] args) {


        System.out.println(getName("홍길동"));
        System.out.println(getName("아무개"));

    }

    public static String getName(String name) {
        return "고객:" + name + "님";
    }

}
