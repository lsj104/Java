package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		//나이: 태어난 년도를 입력받아 나이를 출력하시오 조건: 우리나라 나이로
		
		System.out.printf("태어난 년도:"); //라벨 출력
		Scanner scan = new Scanner(System.in); //스캐너 생성 
		int year = scan.nextInt(); //정수 토큰 읽기
		int age = 2023 - year; //한국 나이 계산
		System.out.printf("나이:%d세", age); //나이 출력
		
		

	}

}
