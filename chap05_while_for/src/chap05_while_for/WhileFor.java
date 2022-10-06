package chap05_while_for;

import java.util.Scanner;

public class WhileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 - while문
		// 조건이 참일 때, 안의 블록을 반복한다.
		// 반복문 while을 쓸 때 주의점
		// 1. 조건문이 true일 때만 안의 내용이 실행
		// 2. 조건문이 항상 true면 무한반복에 빠져서 프로그램이 끝나지 않는다.
		int num = 0; 
		while (num<5) {
			System.out.println("반복하고 있습니다."+num);
			num++;  // 이 부분이 빠지면 무한루프에 빠진다.
		}

		
		// while : 1 ~ 10 카운트다운 출력
		int countDown = 1;
		while (countDown<=10) {
			System.out.println(countDown);
			countDown++;
		}
		

		
		
		
		// do while문 : 반복한 내용이 무조건 한 번은 실행되는 조건문
		Scanner input = new Scanner(System.in);
		int num4 = 0;
		int sum4 = 0;
		
		do { // while의 뒤에 있던 반복할 내용이 do를 이용해서 앞으로 가져옴
			System.out.print("더할 값을 입력하세요(0을 넣으면 종료) : ");
			num4 = input.nextInt();
			sum4 += num4;
		} while(num4 != 0); // 조건이 참이라면 do로 올라가 다시 반복, ; 적는 거 주의
		System.out.println("더한 값 : "+sum4);
		

		// do while : 1~10까지의 내용 출력 (위의 while 카운트다운과 비교해보자)
		int num5 = 1;
		do {
			System.out.println(num5); // 1출력
			num5++; // num5의 값 증가
		} while (num5<=10);
		
		
		System.out.println(); // 출력 확인 용이
		
		
		
		
		
		// for(초기화; 조건식; 증감계산)
		for (int num6 = 1; num6<=10; num6++) {
			System.out.println(num6);
		}
		
		
		// for문을 이용한 1~10까지의 합
		int sum7 = 0;
		for (int num7=1; num7<=10; num7++) {
			sum7 += num7;
		}
		System.out.println(sum7);

		
		// for문의 초기화 값은 for문 안에서만 사용이 가능하다.
		for (int i=0; i<5; i++) {
			System.out.println("반복문입니다."+i);
		}
		// System.out.println(i); // for문 밖에서는 쓸 수 없다.
		// 다른 for문에서 사용한 이름은 다른 for문에서 사용할 수 있다.
		for (int i=0; i<10; i++) {
			System.out.println("새로운 i를 이용한 반복문입니다."+i);
		}
		
		
		
		
		
		// for문과 조건
		// 1~20까지의 정수 중 (2 또는 3의 배수)가 아닌 수의 총합.
		int sum1 = 0;
		for (int num9=1; num9<=20; num9++) {
			// !(num9%2==0 || num9%3==0)
			if (num9%2!=0 && num9%3!=0) { 
				sum1 += num9;
			}
		}
		System.out.println("2 또는 3의 배수가 아닌 수의 총합 : "+sum1);
		
		
		
		
		
		// 중첩 반복문 : 반복문 안에 반복문이 들어가 있는 형태
		for (int i=0; i<2; i++ ) {
			System.out.println("for문 i에서의 반복중입니다.");
			for (int j=0; j<2; j++) {
				System.out.println("i"+i+"j"+j);
			}
		}
		System.out.println("내부 for문이 종료되었습니다.");
		
		
		// 중첩 반복문, 5*5 박스 만들기
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("* ");
			}
			// * 5개가 찍힌 후 줄바꿈
			System.out.println();
		}
		
		
		
		
		
		// 중첩 반복문과 조건
		// 중첩 반복문 확인
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(i+","+j+"  ");
			}
			System.out.println();
		}
		
		// 중첩 반복문 확인 - 조건문 넣기  // 코드의 규칙을 알아보기 위한 것
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i>=j)
				System.out.print(i+","+j+"  ");
			}
			System.out.println();
		}
		
		
		
		
		// *을 계단 형태로 출력하기
		for (int i=0; i<=5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 바로 위와 같으나 if문을 넣음, 위에는 for문에 바로 조건 넣음
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i>=j) {
					System.out.print("* ");					
				}
			}
			System.out.println();
		}
		
		
		
	}

}
