package practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 복습 간단히
		int sum; // 변수 선언 = 변수를 사용할 준비가 됨
		sum = 6+8; // 14
		sum = 2+1; // 3 - 변수는 가장 마지막 값을 가지게 된다.
		// 코드는 항상 위에서 아래로 실행된다.
		// 위의 확인을 위해 디버거 사용. 브레이크 포인트, 스텝 오버
		System.out.println(sum);

		String name = "홍길동"; // 변수의 초기화
		
		// 선언을 먼저하는 경우
		// for, while 반복문을 사용할 때 선언을 해줌
		int num = 0;
		for (int i=0; i<5; i++) {
			num = i;
		}
		System.out.println("프로그램이 끝났습니다.");
		
		
		if (num>3) { // 조건식을 만들기 위한 규칙
			System.out.println("a의 값은 3보다 큽니다.");
		}
		
		
		
		
		
		// 순서도 예제 작성 - 통장 확인 프로그램
		// 기능을 선택하고 금액을 입력하면 입금, 출금, 송금하는 프로그램
		
		// 변수 : 통장 = 이미 가지고 있는 금액
		// 입금 : 통장에 입력한 금액을 추가함
		// (아래의 기능 조건 - 통장의 금액이 입력한 금액보다 클 때)
		// 출금 : 통장에서 입력한 금액이 감소함
		// 송금 : 통장에서 입력한 금액이 감소함
		//		 + 어디로 보낼건지를 입력받고, 마지막에 어디로 보내는지 안내함
		
		
		// 변수값을 선언 및 초기화
		int account = 10000;  // 내 통장에 있는 금액
		int money = 0;		  // 입금, 출금, 송금할 금액
		String bank;		  // 원하는 기능 선택(입금, 출금, 송금)
		String address;		  // 송금할 곳
		
		
		// 기능 입력 안내
		System.out.print("원하는 기능을 입력하세요(입금/출금/송금) : ");
		// 기능값 입력
		Scanner input = new Scanner(System.in);
		bank = input.next();
		
		// 금액 입력 안내
		System.out.print("금액을 입력하세요 : ");
		money = input.nextInt();
		
		if (bank.equals("입금")) {
			account += money;
			System.out.println("현재 잔액 "+account+"원 입니다.");
		} else if (bank.equals("출금")) {
			// account의 금액이 money보다 크거나 같다면 실행
			if (money<=account) {
				account -= money;
				System.out.println("현재 잔액 "+account+"원 입니다.");
			} else {
				System.out.println("출금할 잔액이 부족합니다.");
			}
		} else if (bank.equals("송금")) {
			if (money<=account) {
				System.out.print("송금할 주소를 입력하세요 : ");
				address = input.next();
				account -= money;
				System.out.println(address+"(으)로 송금했습니다.");
				System.out.println("현재 잔액 "+account+"원 입니다.");
			} else {
				System.out.println("송금할 잔액이 부족합니다.");
			} 
		} else {
			System.out.println("없는 기능입니다.");
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
