package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
public class JavaTest {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=  new Scanner(System.in);
		while(true) {
			try {
				System.out.print("정수를 입력하세요: ");
				int num = scan.nextInt();
				if(num==0) throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("0은 입력할 수 없습니다.");
				break;
			}
		}
	}
}