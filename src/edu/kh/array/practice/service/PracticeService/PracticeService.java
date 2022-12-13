package edu.kh.array.practice.service.PracticeService;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		int sum = 0;
		
		int arr[] = new int[9];
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = a+1;
			if(a % 2 == 0) {
				sum+= arr[a];
			} 
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	
	public void practice2() {
		
		int sum = 0;
		
		int arr[] = new int[9];
		
		int num = arr.length;
		
		for(int a = 0 ;  a < arr.length; a++) {
			arr[a] = num;
			num--;
			if(a % 2 == 1) {
				sum += arr[a];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번째 인덱스 합 : " + sum);
		
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int a = 0; a < input; a++) {
			arr[a] = a+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[5];
		
		for(int a = 0 ; a < arr.length; a++) {
			System.out.print("입력 " + a +":");
			int input = sc.nextInt();
			arr[a] = input;
		}
			System.out.print("검색할 값 : ");
			int select = sc.nextInt();
			
			for(int a = 0; a < arr.length; a++) {
				if(arr[a] == select) {
					a = sum;
					System.out.print("인덱스 값 : " + sum);
				} else {
					System.out.print("일치하는 값이 존재하지 않습니다");
				}
			
			}
			
				
	}
	
}
