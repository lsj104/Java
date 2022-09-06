package com.test.question;

import java.util.Calendar;

public class Bugles {
    private int price;
    private int weight;
    private Calendar creationTime;
    private int expiration;

    public void setSize(int weight) {

        if (weight == 300 || weight == 500 || weight == 850) {
            this.weight = weight;
        } else {
            return;
        }

    }

    public int getPrice() {

        if (weight == 300) {
            this.price = 850;
            this.expiration = 7;
        } else if (weight == 500) {
            this.price = 1200;
            this.expiration = 10;
        } else if (weight == 850) {
            this.price = 1950;
            this.expiration = 15;
        }

        return price;
    }

    public void setCreationTime(String date) { //제조시간

        Calendar c = Calendar.getInstance();

        c.set(Integer.parseInt(date.substring(0, 4)),
                Integer.parseInt(date.substring(5, 7)) - 1,
                Integer.parseInt(date.substring(8)));

        this.creationTime = c;
    }


    public int getExpiration() {
        //먹을 수 있는 날짜 = 유통기한 - 현재 - 제조시간

        Calendar now = Calendar.getInstance();

        return this.expiration - (int) ((now.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24);
    }

    public void eat() {

        if (getExpiration() >= 0) {
            System.out.println("과자를 맛있게 먹습니다.");
        } else {
            System.out.println("유통기한이 지나 먹을 수 없습니다.");
        }

    }

}
