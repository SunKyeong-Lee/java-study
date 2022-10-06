package practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 조건문, 반복문 연습
		
		// 비밀번호가 1111 일 때
		// 참 : 비밀번호가 맞습니다, 거짓 : 비밀번호가 아닙니다 - 출력하기
		// 문자를 비교할 때는 .equals(비교할 문자)를 사용하면 된다. 
		Scanner input = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요.");
		String password = input.next();
		if (password.endsWith("1111")) {
			System.out.println("비밀번호가 맞습니다.");
		} else {
			System.out.println("비밀번호가 아닙니다.");			
		}
		
		
		
		
		
		// 각 달의 숫자를 적었을 때, 달의 일수를 출력하는 프로그램 작성하기
		// 1,3,5,7,8,10,12 : 31일 / 4,6,9,11 : 30일 / 2: 28, 29일
		
		// Switch문
		System.out.print("일수를 알고 싶은 달을 입력하세요 : ");
		int month = input.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일입니다.");
			break;
		case 2:
			System.out.println("28, 29일입니다.");
			break;
		default:
			System.out.println("입력하신 달은 없습니다.");
		}
		
		// if - else if - else문
		if (month==1 || month==3 || month==5 || month==7 
				|| month==8 || month==10 || month==12) {
			System.out.println("31일입니다.");			
		}
		else if (month==4 || month==6 || month==9 || month==11) {
			System.out.println("30일입니다.");			
		}
		else if (month==2) {
			System.out.println("28, 29일입니다.");			
		} else {
			System.out.println("입력하신 달은 없습니다.");			
		}
		
		
		
		
		
		// "그만"을 입력할 때까지 입력받은 문자열을 그대로 출력하는 프로그램 작성
		
		// while문
		System.out.print("그만을 입력하면 멈춥니다. 아무글이나 입력하세요 : ");
		String word = input.next();
		
		while (!word.endsWith("그만")) {
			System.out.println(word);
			System.out.print("그만을 입력하면 멈춥니다. 아무글이나 입력하세요 : ");
			word = input.next();
		}
		System.out.println("종료 되었습니다.");
		
		// do - while문
		String word1 = "안녕";
		do {
			System.out.print("그만을 입력하면 멈춥니다. 아무글이나 입력하세요 : ");
			word1 = input.next();
			System.out.println(word1);
		} while (!word1.endsWith("그만"));
		System.out.println("종료 되었습니다.");
		
		
		
		
		
		// for문을 이용해 구구단 15단 출력하기
		int dan = 15;
		for (int i=1; i<10; i++) {
			System.out.println(dan+" x "+i+" = "+dan*i);
		}
		
		
		
		

		// 교통카드 시스템 만들기
		// card 안에 현재의 잔액이 있다. 지하철 요금 1300원
		
		// while 문
		System.out.print("지하철에 탑승하시겠습니까? 네:1 아니오:0");
		int getSubway = input.nextInt();
		int card = 3000;
		int fare = 1300;
		
		while (getSubway==0) {
			if (card>=fare) {
				card -= fare;
				System.out.println("탑승하였습니다. 현재 남은 잔액은 "
									+card+"원 입니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
			System.out.print("지하철에 탑승하시겠습니까? 네:1 아니오:0");
			getSubway = input.nextInt();
		}
		System.out.println("종료되었습니다.");
		
		// do while문 사용
		int card1 = 3000;
		int fare1 = 1300;
		int getSubway1 = 0;
		
		do {
			System.out.print("지하철에 탑승하시겠습니까?(네:1, 아니오:0) : ");
			getSubway1 = input.nextInt();
		
			if (card1 >= fare1) {
				card1 -= fare1;
				System.out.println("탑승하였습니다. 현재 남은 잔액은 "+card1+"원 입니다.");
			}
			else if (card1 < fare1) {
				System.out.println("잔액이 부족합니다.");
			} 
		} while (getSubway1 == 1);
		System.out.println("종료되었습니다.");
		
		
		
		
		
		

	}

}
