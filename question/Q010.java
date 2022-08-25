package com.test.question;

public class Q010 {

    //메소드:자릿수

    public static void main(String[] args) {
        digit(1);
        digit(12);
        digit(321);
        digit(5678);
        digit(98765);

    }

//    public static void digit(int num) {
//        String result ="";
//        result = (num < 10)? "000" + num: (num<100)? "00" + num : (num<1000)? "0" + num: "" + num;
//
//        System.out.printf("%d -> %s\n", num,result);
//    }

    public static int digit(int num){
        String result = "";
        if (num < 10){
          result = "000" + num;
        } else if (num < 100) {
            result = "00" + num;
        } else if (num < 1000) {
            result = "0" + num;
        } else {
            result = "" + num;
        }
        System.out.printf("%d -> %s\n", num,result);
        return num;
    }

}
