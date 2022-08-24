package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
	
		//사각형: 사각형의 너비와 높이를 입력받아 넓이와 둘레 측정
		
		Scanner scanwid = new Scanner(System.in);
		System.out.printf("너비(cm):");
		int wid = scanwid.nextInt();
		
		Scanner scanhei = new Scanner(System.in);
		System.out.printf("높이(cm):");
		int hei = scanhei.nextInt();
		
		int area = wid * hei; //넓이 계산
		int per = (wid * 2) + (hei * 2); //둘레 계산
		
		System.out.printf("사각형의 넓이는:%dcm^입니다.\n", area);
		System.out.printf("사각형의 둘레는:%dcm입니다.", per);

	}

}
