package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {

	Scanner sc = new Scanner(System.in);
	/* 배열(array)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.(자료구조) *중요
	 * - 묶여진 변수들은 하나의 배열명으로 불려지고 구분은 index를 이용함
	 *  (index는 0부터 시작하는 정수)
	 * 
	 * 
	 * 
	 * 
	 * 배열 특징<외워>
	 *  <정의> *중요
		같은 자료형의 변수를 하나의 묶음으로 다루는것

		1.한 가지 자료형만 저장가능
		
		2. 여러 값 저장가능
		
		3. 한번 크기를 지정하면 변경 불가능

=============

배열 선언과 할당

변수 : 메모리에 값을 저장할 수 있는공간

변수선언 : 메모리에 값을 저장할 수 있는 공간을 할당

**배열
*변수와 조금 의미가 다름
배열 선언 : 메모리에 배열을 참조하는 변수 공간 할당
(값 직접 저장x, 배열의 주소를 저장)

배열할당 : 실제 값을 저장할 수 있는 배열을 메모리에 생성

**Heap 영역에 할당된 공간은 절대 비어있을 수 없다
최초 할당 시 jvm 기본값이 자동 저장된다(컴파일러)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public void ex1() {
		//변수 vs 배열
		
		// 1-1. 변수 선언
		int num;
		// Stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 생성(할당)하고
		// 그 공간에 num이라는 이름을 부여
		
		// 1-2.변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10울 대입
		
		// 1-3. 변수 사용
		System.out.println("num에 저장된 값 : "+ num);
		//num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		//===============================================
		
		// 2-1 배열 선언
		int[]arr;
		// stack 영역에 int[]배열 자료형 공간을 4byte 할당하고
		// 그 공간에 arr이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소 값(4byte)만을 저장할 수 있음
		
		// 2-2. 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며, Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		// int[3] : int자료형 변수 3개를 하나의 묶음으로 나타냄
		// new int[3] : Heap 영역에 int 3칸짜리 int[]을 생성
					// ** 생성된 int[]에는 *시작주소*가 저장된다 **
		
		// 2-3. 배열 요소 값 대입
		// arr은 int[] 참조형 변수이지만
		// arr[0]~[2] int 자료형 변수이기때문에 정수 값을 대입할 수 있다
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		
		// 2-4. 배열 요소 값 읽어오기
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	
	public void ex2() {
		//배열 선언 및 할당
		
		int[]arr = new int[4];
		// 1) stack 영역에 int[] 자료형 참조형 변수 arr 선언
		// 2) heap 영역에 int 자료형 4개묶음으로 다루는 int[]할당
		// 3) 생성된 int[]의 주소를 arr에 대입하여 참조하는 형태를 만듬
		
		// 배열 길이(몇 칸인가): 배열명.length
		System.out.println("배열 길이 : " + arr.length);
		
		arr[0] = 100;
		arr[1] = 300;
		arr[2] = 500;
		arr[3] = 1000;
		
		for(int i = 0; i < arr.length; i++) {
			// 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
		
		
	}

	public void ex3() {

		
		double sum = 0;
		String s = "";
		
		double arr[] = new double[5];
		
		for(int a = 0; a < arr.length; a++) {
			System.out.printf("%d번 키 입력 : ", a+1);
			arr[a] = sc.nextDouble();
			
			sum += arr[a]; //평균값
			s += arr[a] + " "; // 
		}
		System.out.printf("입력 받은 키 : %s\n", s);
		System.out.println(sum/(double)arr.length);
				
				
		
	}
	

	public void ex33() {
		double arr[] = new double[5];
		
		for(int a = 0; a < arr.length; a++) {
			System.out.print((a+1) + "번 키 입력 : ");
			
			arr[a] = sc.nextDouble();
			//각 인덱스에 입력받은 값을 대입
		}
		System.out.println();
		
		double sum = 0; //합계용 변수
		
		for(int b = 0; b < arr.length; b++) {
			System.out.print(arr[b] + " ");
			
			sum += arr[b]; //배열에 저장된 값을 sum에 누적
		}
		System.out.printf("\n평균 : %.2f\n", sum/arr.length);
	}
	
	public void ex4() {
		
		double sum = 0;
		
		double arr[] = new double[4];
		
		for(int a = 0; a < arr.length; a++) {
			System.out.print((a+1) + "번 점수 입력 : " );
			arr[a] = sc.nextDouble();
		}
		System.out.println();
		
		for(int b = 0; b < arr.length; b++) {
			sum += arr[b];
			
		}
		
		double max = arr[0];
		double min = arr[0];
		
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("합계 : " +(int)sum );
		System.out.println("평균 : " + sum/arr.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
	}
	
	
	public void ex5() {
		//배열 선언과 동시에 초기화
		char[] arr = new char[5];
		
		//char[] arr 이 참조하는 배열 요소에 ABCDE대입하기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)('A' + i);
		}
		
		/* **arrays 클래스
		 * > java에서 제공되는 배열과 관련된 기능을 모아둔 클래스
		 * 
		 * Arrays.toString(배열명) : 모든 요소 값 출력
		 * 
		 * */
		int[] arr2 = new int[4];
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		// 배열 선언과 동시에 초기화
		char[] arr3 = {'A','B','C','D','E'};
		
		// Char[] 참조 변수 arr3를 선언하고
		// heap영역에 char 5칸짜리 char[]을 생성하고
		// 각각 'A','B','C','D','E'로 초기화 후 주소를 arr3에 대입
		// char[] 변수명 = {각각 넣고싶은거};
		System.out.println(Arrays.toString(arr3));
	}
	
	
	public void ex6() {
		//배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		// 회원가입할때 주로 사용
		
		int[] arr = {100,200,300,400,500,600,700,800,900,1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		// flag == false :일치하는값이 존재하지 않음
		// flag == true : 일치하는 값이 존재
		
		boolean flag = false; //검사 전에는 없다고 가정
		
		// arr 배열 요소 순차 접근
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.println(i + "번째 인덱스에 존재");
				
				flag = true; //일치하는 값이 있으므로 true 변경
			}
		}
		// flag 상태를 검사
		if( !flag ) {//부정연산자
			System.out.println("존재하지 않음");
		}
		
		
	}	
	
	public void ex7() {
		//입력 받은 값과 일치 값이 있으면 인덱스 번호 출력
		// 없으면 존재하지 않음
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		//equals() ==> 배열명[i].equals(비교할 값)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과일 이름 : ");
		String name = sc.next();
		
		boolean flag = false;
		
		for(int a = 0; a <= arr.length; a++) {
			if(arr[a].equals(name)) {
				System.out.println(a + "번째 인덱스에 존재");
				
				flag = true;
			}
			//if(arr[i] == input) //String형에서 쓰면 무조건 false
		}if(!flag ) {
			System.out.println("존재하지 않음");
		}
		
	}
	
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String name = sc.nextLine();
		// 1.문자열을 입력 받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		char[] arr = new char[name.length()]; //공간 생성
		// 공간 만들떄 출력할 거 생각해서 넣어라 
		for(int b = 0;  b < arr.length; b++) { // <= (X)  < (o) 만써 
			arr[b] = name.charAt(b);
		}	// 2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
			System.out.print("검색할 문자 입력 : ");
			char ch = sc.nextLine().charAt(0); // char = sc.nextline이라는 연결어가 없음 
			//그래서 string으로 받아오고 뒤에.charat를 써서 한 글자만 받아오겠다는뜻
					//string.charat(0) : 문자열 제일 앞 문자 (1) 이면 두번째 ......
			int count = 0;
			
			for(int a = 0; a < arr.length; a++) {
				if(arr[a]  == ch) {
					count++;
				}
			}
			
			if(count > 0 ) {
				System.out.println(count + "개 있음");
			}else {
				System.out.println("존재하지 않음");
			}
			
	}
	
	public void ex9() {
		
		
		
		
		
		
		
		
		
	}
	
	
	public void ex10() {
		
		
	}
	
	
	
}

