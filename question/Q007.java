package com.test.question;

import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {
		//대소문자 변환
		Scanner slscan = new Scanner(System.in);
		System.out.print("문자 입력:");
		String small = slscan.nextLine();
		int code = (int)small.charAt(0); //String을 Char로 바꾼 후 int로 변환해 코드값 얻기
		
		char cap = (char) (code - 32); //A코드값 65, a코드값 97, 32차이
		
		System.out.printf("소문자'%s'의 대문자는 '%s'입니다.", small, cap);
		

	}

}
