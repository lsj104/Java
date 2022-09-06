package com.test.question;

public class Note {

    private String size; //크기
    private String color; //색상
    private int page; //페이지수
    private String owner; //소유자
    private int price; //가격
    private String think = ""; //두께

    public void setSize(String size) {

        //크기 A3 A4 A5 B3 B4 B5

        if (size.equals("A3") || size.equals("A4") || size.equals("A5") ||
                size.equals("B3") || size.equals("B4") || size.equals("B5")) {
            this.size = size;
        } else {
            return;
        }

    }

    public void setColor(String color) {

        //색상 검정색 흰색 노란색 파란색

        if (color.equals("검정색") || color.equals("흰색") || color.equals("노란색") ||
                color.equals("파란색")) {
            this.color = color;
        }

    }

    public void setPage(int page) {

        //페이지수 10-200이내

        if (page >= 10 && page <= 200) {
            this.page = page;
        } else {
            return;
        }

        if (page >= 10 && page <= 50) { //10-50 얇다
            think = "얇은";
        }

        if (page >= 51 && page <= 100) { //51-100 보통
            think = "보통";
        }

        if (page >= 101 && page <= 200) { //101-200 두껍다
            think = "두꺼운";
        }

    }

    public void setOwner(String owner) {

        //한글 2-5자 이내

        for (int i = 0; i < owner.length(); i++) { //한글인지 체크
            char c = owner.charAt(i);
            if (c < '가' && c > '힣') {
                return;
            }
        }

        if (owner != null && owner.length() >= 2 && owner.length() <= 5) { //한글일때 2-5자이내인지 체크
            this.owner = owner;
        }

    }

    public String info() {

        this.price = 500; //기본 가격 500원

        //크기별 가격 추가

        if (this.size.equals("A3")) {
            this.price += 400;
        } else if (this.size.equals("A4")) {
            this.price += 200;
        } else if (this.size.equals("B3")) {
            this.price += 500;
        } else if (this.size.equals("B4")) {
            this.price += 300;
        } else if (this.size.equals("B5")) {
            this.price += 100;
        }

        //색상별 가격 추가

        if (this.color.equals("검정색")) {
            this.price += 100;
        } else if (this.color.equals("노란색")) {
            this.price += 200;
        } else if (this.color.equals("파란색")) {
            this.price += 200;
        }

        //페이지당 10원 추가

        if (this.page > 10) {
            this.price += (page - 10) * 10; //기본 10페이지를 제외한 후 가격 추가
        }


        //이름 필수값
        if (this.owner != null) {
            return String.format("■ ■ ■ ■ ■ ■ 노트 정보 ■ ■ ■ ■ ■ ■\n"
                            + "소유자: %s\n"
                            + "특성: %s %s %s노트\n"
                            + "가격: %,d원\n"
                            + "■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■",
                    this.owner, this.color, this.think, this.size,
                    this.price);
        } else {
            return String.format("■ ■ ■ ■ ■ ■ 노트 정보 ■ ■ ■ ■ ■ ■\n"
                    + "주인없는 노트\n"
                    + "■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
        }

    }
}
