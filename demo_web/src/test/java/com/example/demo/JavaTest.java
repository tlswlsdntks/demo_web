package com.example.demo;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class JavaTest {

	@Test
	void contextLoads() {
		
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int k = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(i*j == 10)
					arr[k++] = j;
			}
		}
		k = 0;
		arr = Arrays.copyOf(arr, arr.length - k);
		for(int i=1; i<=20; i++) {
			for(int j=1; j<=20; j++) {
				if(i*j == 20)
					arr2[k++] = j;
			}
		}
		arr2 = Arrays.copyOf(arr, arr.length - k);
		for(int a : arr){
			for(int a2 : arr2) {
				if(a == a2)
					System.out.println(a);
			}
		}
	}

}
