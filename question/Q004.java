package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		//섭씨 온도를 입력받아서 화씨 온도로 변환
		
		Scanner celscan = new Scanner(System.in);
		System.out.print("섭씨(℃ ):");
		double cel = celscan.nextDouble();
	
		double fah = cel * 1.8 + 32; // 섭씨를 화씨로 바꾸는 계산 
		
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.\n", cel, fah); //소수 이하 1차리 출력 

	}

}
