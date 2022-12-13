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
		
		int arr[] = new int[5];
		boolean tf = false;
		
		for(int a = 0 ; a < arr.length; a++) {
			System.out.print("입력 " + a +":");
			int input = sc.nextInt();
			arr[a] = input;
		}
			System.out.print("검색할 값 : ");
			int select = sc.nextInt();
			
			for(int a = 0; a < arr.length; a++) {
				if(arr[a] == select) {
				System.out.print("인덱스 : " + a);
				tf = true;
				} 
			}
			if(!tf) {
				System.out.println("없다");
			}
			
				
	}

	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String st = sc.nextLine();
		
		char arr[] = new char[st.length()];
		for(int a = 0; a < st.length(); a++) {
			arr[a] = st.charAt(a);
		}
		System.out.print("문자 : ");
		char select = sc.next().charAt(0);
		
		int count = 0;
		int num = 0;
		
		for(int a = 0; a < st.length(); a++) {
			if(arr[a] == select) {
				num = a;
				count++;
			}
		}if(count > 0) {
			System.out.print(st + "에" + select + "가 존재하는 위치(인덱스 : )" + num);
			System.out.print(select + "개수 : " + count);
		}
		
		
	}
}
