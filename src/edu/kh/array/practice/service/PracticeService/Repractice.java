package edu.kh.array.practice.service.PracticeService;

import java.util.Arrays;
import java.util.Scanner;

public class Repractice {
	Scanner sc = new Scanner(System.in);

	public void ex1() {
		
		int arr[] = new int[9];
		int sum = 0;
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = a+1;
			System.out.print(arr[a] + " ");
			
			if(a % 2 == 0){
				sum += arr[a];
			}
		}
		System.out.println("\n짝수 인덱스  : " + sum);
	}

	public void ex2() {
		int arr[] = new int[9];
		int sum = 0;
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = arr.length-a;
			System.out.print(arr[a] + " ");
			
			if(a % 2 == 1) {
				sum += arr[a];
			}
		}
		System.out.print("\n 홀수 번째 인덱스 합 : " + sum);
	}
	
	public void ex3() {
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int arr[] = new int[input];
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = a+1;
			System.out.print(arr[a] + " ");
		}
	}
	
	public void ex4() {
		
		int arr[] = new int[5];
		
		for(int a = 0; a < arr.length; a++ ) {
			System.out.print("입력 " + a + " :" );
			arr[a] = sc.nextInt();
			
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		boolean flag = true;
		
		for(int a = 0; a < arr.length; a++ ) {
			if(arr[a] == search) {
				System.out.println("인덱스 : " + a);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("없다");
		}
		
	}
	
	public void ex5() {
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char arr[] = new char[input.length()];
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = input.charAt(a);
		}
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		System.out.print(input + "에 " + ch +"가 존재하는 위치 : " );
		for(int a = 0; a < arr.length; a++) {
			if(arr[a] == ch) {
				System.out.print(a + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + "개수 : " + count);
	}
	
	public void ex6() {
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int sum = 0;
		int arr[] = new int[input];
		
		for(int a = 0; a < arr.length; a++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",a);
			int select = sc.nextInt();
			arr[a] = select;
			sum += select;
		}
		System.out.print(Arrays.toString(arr));
		System.out.println("\n총합 : " + sum);
	}
	
	public void ex7() {
		
		System.out.print("주민등록번호(-포함)");
		String input = sc.nextLine();
		
		char arr[] = new char[input.length()];
		
		for(int a = 0; a < arr.length; a++) {
			if(a < 8) {
				arr[a] = input.charAt(a);
			}  else {
				arr[a] = '*';
			}
			System.out.print(arr[a]);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
