package com.test.question;

public class Book {

    //모든 멤버 변수의 접근 지정자는 private으로 한다
    //제목, 가격, 저자, 출판사, 발행년도, ISBN, 페이지수
    //쓰기 = Setter
    
    private String title; //최대 50자이내(한글, 영어, 숫자, 공백)
    private int price;
    private String author;
    private String publisher;
    private String pubYear = "2019";
    private String isbn;
    private int page;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        //길이 -> 올바르지 않은걸 검사
        if (title.length() > 50) {
            //메소드 종료
            return; //빈 리턴문 -> 메소드 종료때 사용
        }

        //형식
        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i); //문자코드값 얻기

            if ((c < 'A' || c > 'Z')
                    && (c < 'a' || c > 'z')
                    && (c < '가' || c > '힣')
                    && c != ' '
                    && (c < '0' || c > '9')) {
                return;
            }
        }
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        if (price < 0 || price > 100000) {
            return;
        }

        this.price = price;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page < 1) {
            return;
        }

        this.page = page;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPubYear() {
        return pubYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String info() {
        return String.format("제목:%s\n가격:%d원\n저자:%s\n출판사:%s\n발행년도:%s년\nISBN:%s\n페이지:%s장"
                , this.title, this.price, this.author, this.publisher, this.pubYear, this.isbn, this.page);

    }

}
