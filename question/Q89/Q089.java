package com.test.question;

public class Q089 {
    public static void main(String[] args) {
        // 클래스 Bugles

        Bugles snack = new Bugles();

        snack.setSize(500);
        snack.setCreationTime("2022-09-02");
        System.out.println("가격 : " + snack.getPrice() + "원");
        System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");

        snack.eat();


        System.out.println();

        Bugles snack2 = new Bugles();

        snack2.setSize(300);
        snack2.setCreationTime("2022-08-25");
        System.out.println("가격 : " + snack2.getPrice() + "원");
        System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");

        snack2.eat();
    }
}
