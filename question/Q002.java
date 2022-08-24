package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		//연산식: 숫자 2개를 입력받아 연산식 출력, 출력숫자에 천단위 표기,결과 값은 소수 이하 1자리 표기
		
		Scanner scan1 = new Scanner(System.in); //스캐너 생성
		System.out.printf("첫번째 숫자:");
		int num1 = scan1.nextInt(); //정수 토큰 읽기
		
		Scanner scan2 = new Scanner(System.in); //스캐너 생성
		System.out.printf("두번째 숫자:");
		int num2 = scan2.nextInt(); //정수 토큰 읽기
		
		int sum = num1 + num2; //더하기
		int sub = num1 - num2; //빼기
		int mul = num1 * num2; //곱하기
		float div = (float)num1 / num2; //나누기
		int rem = num1 % num2; //나머지
	
		
		System.out.printf("%,d + %,d = %,d\n", num1, num2, sum);
		System.out.printf("%,d - %,d = %,d\n", num1, num2, sub);
		System.out.printf("%,d * %,d = %,d\n", num1, num2, mul);
		System.out.printf("%,d / %,d = %.1f\n", num1, num2,div); //나머지 연산 소수 이하 1자리 표기 
		System.out.printf("%,d %% %,d = %d\n", num1, num2,rem);
		
	}

}
