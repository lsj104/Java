package com.test.question;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		//자전거
		Scanner scan = new Scanner(System.in);
		System.out.print("사용자가 페달을 밟은 횟수:");
		int user = scan.nextInt();
		
		double meter = 0.0254; // 1인치 = 0.0254m
		double circumference = 26 * 3.14 * meter; 
		double result = user * circumference;
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %.3fm를 달렸습니다", user, result);
		

	}

}
