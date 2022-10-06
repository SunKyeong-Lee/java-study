package chap04_If;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 조건문
		// if문
		// ()안의 조건이 참(true)일 때, 실행이 된다.
		// 거짓(false)일 때는 아무것도 실행되지 않는다.
		
		// if문 안에 한 줄일 때, 중괄호 {}를 쓰지 않아도 괜찮다.
		if (true)
			System.out.println("코드가 실행됩니다.");
		// if문 바깥에 있는 코드는 if문의 영향을 받지 않는다.
		System.out.println("프로그램이 종료되었습니다.");
		
		// 조건문 안에 여러 줄일 때, 중괄호 {}를 써서 감싼다.
		int age = 9;
		if (age>=6) {
			System.out.println(age+"세 입니다.");
			System.out.println("놀이기구를 탈 수 있습니다.");
		}
		
		
		
		
		// if - else문
		// 참일 때와 거짓일 때 다른 코드 실행
		if (false) {
			System.out.println("참입니다.");
		}
		else {
			System.out.println("거짓입니다.");
		}
		
		// 조건문 안에 여러 줄일 때, 중괄호 {}를 써서 감싼다.
		int age1 = 3;
		if (age1>6) {
			System.out.println("축하합니다.");
			System.out.println("놀이기구를 탈 수 있습니다.");
		} 
		else {
			System.out.println("놀이기구를 탈 수 없습니다.");
			System.out.println("다음에 이용해 주세요.");	
		}
		
		
		
		
		// 삼항 연산자 ( ? : )
		// 한 줄에다가 참/거짓을 확인하고 싶을 때
		// 삼항연산자의 결과 값은 조건에 따른 참/거짓 값이다.
		// 삼항 연산자의 특징 : 계산을 하고 그 결과값을 출력
		int x = 10;
		int y = 11;
		int maxNum = x>y?x:y; // ﻿10 > 11 : false
		System.out.println(maxNum);  // 11 출력 
		
		
		
		
		// 중첩 if
		// 실습, 코드값을 이용한 성별 확인
		// 1, 3이 들어왔을 때 "남자입니다." 출력
		// 2, 4가 들어왔을 때 "여자입니다." 출력
		int code = 2; // code의 값에 따라 출력 결과가 바뀐다.
		if (code==1 || code==3) {
			System.out.println("남자입니다.");
		} else {
			if (code==2 || code==4) {
				System.out.println("여자입니다.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		
		
		
		// if - if else - else문
		int code1 = 4;
		if (code1==1 || code1==3) {
			System.out.println("남자입니다.");
		}
		// else if 통해서 다른 조건문을 작성해 줄 수가 있다.
		else if (code1==2 || code1==4) {
			System.out.println("여자입니다.");
		}
		// 여기서 else문은 바로 위에 있는 조건이 거짓(false)일 때 실행
		else {  
			System.out.println("없는 코드입니다.");
		}
		
		
		
		
		// switch문
		// ()안에 비교할 값을 넣는다.
		// 비교할 값은 동일한 자료형으로 넣어주어야 한다.
		int number = 6;
		
		switch (number) {
		case 0: // case 뒤에 원하는 값일 경우 출력할 값을 넣는다.
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("많음");
			break;
		}
		

	}

}
