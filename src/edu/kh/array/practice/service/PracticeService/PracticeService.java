package edu.kh.array.practice.service.PracticeService;

import java.util.Arrays;
import java.util.Random;
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

			System.out.print(st + "에" + select + "가 존재하는 위치(인덱스) : " + num);
			System.out.print(select + "개수 : " + count);
			System.out.print(st + "에 " + select + " 가 존재하는 위치(인덱스) : " + num + '\n');
			System.out.print(select + " 개수 : " + count);

		}
		
		
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		for(int a = 0; a < arr.length; a++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", a);
			int num = sc.nextInt();
			arr[a] = num;
			sum += arr[a];
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : " + sum);
		
		
		
		
		
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String number = sc.nextLine();
		
		char arr[] = new char[number.length()];
			
		for(int a = 0; a < arr.length; a++) {
			arr[a] = number.charAt(a);
			if(a > 7) {
				arr[a] = '*';
			}else {
				
			}
		} System.out.print(arr);
	}
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		if(input < 2 || input % 2 == 0) {
			System.out.print("다시 입력하세요");
		}
		for(int a = 0; a < arr.length/2 +1; a++) {
			arr[a] = a+1;
			System.out.print(arr[a]);
		}
		for(int a = input/2; a > 0;  a--) {
			arr[a] = a;
			System.out.print(arr[a]);
		}	
		
	}
	
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = (int)Math.random() * 10 + 1;
		}
		System.out.print("발생한 난수 : ");
		for(int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		
	}
	
	public void practice10() {
		int arr[] = new int[10];
		for(int a = 0; a < arr.length; a++) {
			arr[a] = (int)(Math.random()*10+1);
			
			System.out.print(arr[a] + " ");
		}
				System.out.println();
				int max = 1;
				int min = 10;
				
				for(int a = 0; a < arr.length; a++) {
					if(arr[a] > max) {
						max= arr[a];
					}
					if(arr[a] < min) {
						min = arr[a];
					}
					
				}
				System.out.println("최대값 : " + max);
		        System.out.println("최소값 : " + min);
	}
	
	
	public void practice11() {
		int arr[] = new int[10];
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = (int)(Math.random()*10+1);
			
			for(int b = 0; b < a; b++) {
				if(arr[a] == arr[b]) {
					a--;
					break; //중복없애는 구문
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		int arr[] = new int[5];
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = (int)(Math.random()*45+1);
			
			for(int b = 0; b < a; b++) {
				if(arr[a] == arr[b]) {
					b--;
					break;
				}
			}
		}for(int a = 0; a < arr.length; a++) {
			Arrays.sort(arr );
			System.out.print(arr[a] + " ");
		}
	} 
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char arr[] = new char[input.charAt(0)];
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = input.charAt(a);
		}
		System.out.println("문자열에 있는 숫자 : ");
		
		int sum = 0;
		
		for(int a = 0; a < arr.length; a++ ) {
			for(int b = 0; b < a; b++) {
				if(arr[a] == arr[b]) {
					b--;
					break;
				}
			}
			
		}
		
		
	}
	
	
	
	
}
