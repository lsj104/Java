package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		//세금 계산
		
		Scanner scan = new Scanner (System.in);
		System.out.print("한달 수입 금액(원):");
		double salary = scan.nextDouble();
		
		double tax = salary * 0.033; //세금 계산
		double total = salary - tax; //세후 금액 계산
		
		System.out.printf("세후 금액(원):%,d원\n", (int)total);
		System.out.printf("세금(원):%,.0f원", tax);
		
		

	}

}
