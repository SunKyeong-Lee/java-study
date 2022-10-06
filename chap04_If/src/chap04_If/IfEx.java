package chap04_If;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 실습, if문만 사용
		// 변수 num에 원하는 값을 할당하고, num이 10보다 클 때, 변수를 출력하는 조건문 만들기
		// if문이 끝나면 "프로그램이 종료되었습니다." 출력하기
		int num = 20;
		if (num>10) {
			System.out.println("참 : "+num);
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		
		// 실습, if문만 사용
		// 변수 num1의 값을 입력 받고
		// 입력 받은 값이 10보다 크고 20보다 작다면 변수 num1을 출력하기
		// 마지막에 "프로그램이 종료되었습니다." 출력하기
		
		// 10보다 크다 : num1>10,  20보다 작다 : num1<20
		// 둘 다 참일 때 변수 num1을 출력 : &&
		Scanner input = new Scanner(System.in);
		System.out.print("10보다 크고 20보다 작은 수를 입력하면 출력됩니다 : ");
		int num1 = input.nextInt();

		if (num1>10 && num1<20) {
			System.out.println(num);
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		
		// 실습, if문만 사용
		// String형 변수 name을 선언하고, 본인의 이름으로 초기화하기
		// 입력한 이름이 본인 이름이 맞을 때(같을 때), "본인이 맞습니다."를 출력하기
		// 마지막에 "프로그램이 종료되었습니다." 출력하기
		
		// String은 참조형이라 name == "이름"을 할 수 없다.
		// 값을 받아와서 비교할 때는 .equals(비교할 문자열) 사용
		System.out.print("이름을 입력해주세요 : ");
		String name = input.next();

		if (name.equals("홍길동")) { 
			System.out.println("본인이 맞습니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		
		// 실습, if문만 사용
		// boolean의 변수 rainIs를 선언하고 참으로 초기화하기
		// rainIs가 참이면 "우산을 챙기세요"를 출력하는 조건문 만들기
		// if문이 끝나면 "확인이 완료되었습니다"를 출력하기
		boolean rainIs = true;
		if (rainIs) {
			System.out.println("우산을 챙기세요.");
		}
		System.out.println("확인이 완료되었습니다.");
		
		
		// 실습, if문만 사용, if문을 연달아 사용하는 경우
		/* boolean eat을 선언하고 참으로 초기화하기. 
		 * eat이 참이면 "밥을 먹었다"라고 출력하기
		 * int time을 선언하고 time을 원하는 정수로 초기화하기. 
		 * time의 값이 10보다 작으면 "택시를 탄다"고 출력하기 
		 * 마지막에 "프로그램이 완료되었습니다"를 출력하기 */
		boolean eat = true;
		if (eat) {
			System.out.println("밥을 먹었다.");
		}
				
		int time = 8;
		if (time<10) {
			System.out.println("택시를 탄다.");
		}

		System.out.println("프로그램이 종료되었습니다.");	
		
		
		// 실습, if문만 사용, if문을 연달아 사용하는 경우
		/* String 변수 2개를 만들어 안에 Puppy라는 값을 동일하게 초기화하기. 
		 * 두 변수를 비교해서 "같은 종류입니다"가 출력하기
		 * int time을 선언하고 time을 원하는 정수로 초기화하기. 
		 * time의 값이 10보다 작으면 "택시를 탄다"고 출력하기
		 * 마지막에 "프로그램이 완료되었습니다"를 출력하기 */
		boolean eat1 = true;
		if (eat1) {
			System.out.println("밥을 먹었다.");
		}
				
		int time1 = 8;
		if (time1<10) {
			System.out.println("택시를 탄다.");
		}

		System.out.println("프로그램이 종료되었습니다.");	
		
		
		
		
		// 실습, if - else문
		/*﻿ 정수형 num 변수를 선언하고, 원하는 수로 초기화하기
		 * ﻿num이 0이 아니면 10을 num으로 나눈 값을 출력하고
		 * ﻿num이 0이면 "입력한 값이 0입니다"를 출력하기 */
		int num2 = 5;
		if (num2 != 0) {
			System.out.println("나눈 값 : "+10/num2);
		} else {
			System.out.println("입력한 값이 0입니다.");
		}
		
		// 반대로 작성할 경우
		if (num2 == 0) {
			System.out.println("입력한 값이 0입니다.");
		}
		else {
			System.out.println("나눈 값 : "+10/num2);
		}
		
		
		// 실습,  if - else문
		/* ﻿String자료형 변수를 선언하고, 변수 값을 원하는 문자열로 초기화하기
		 * ﻿변수의 문자열이 "종료"라면 "시스템을 종료합니다"라고 출력
		 * ﻿아니면 "시스템을 유지합니다"라고 출력 */
		String word = "시작";
		if (word == "종료") {
			System.out.println("시스템을 종료합니다.");
		} else {
			System.out.println("시스템을 유지합니다.");
		}
		
		
		// 실습,  if - else문
		/* ﻿점수를 입력 받고 점수가 60보다 크면 "합격", 아니면 "불합격"을 출력
		 * ﻿if-else 문이 끝나면 "수고하셨습니다."를 출력 */
		System.out.print("점수를 입력하세요 : ");
		int score = input.nextInt();
		if (score>60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		System.out.println("수고하셨습니다.");
		
		
		// 실습,  if - else문
		/* ﻿키와 나이를 입력받기
		 * ﻿키 140보다 크고 나이가 10보다 크면 "놀이기구를 탈 수 있습니다"를 출력
		 * ﻿아니면 "놀이기구를 탈 수 없습니다"를 출력 */
		System.out.print("키를 입력하세요 : ");
		int height = input.nextInt();
		System.out.print("나이를 입력하세요 : ");
		int age = input.nextInt();
		if (height>140 && age>10) {
			System.out.println("놀이기구를 탈 수 있습니다.");
		} else {
			System.out.println("놀이기구를 탈 수 없습니다.");
		}
		
		
		// 실습,  if - else문
		// ﻿boolean check를 선언하고 true 또는 false로 초기화
		// ﻿check가 참이라면 "확인했습니다"를 출력하고, 거짓이라면 "다시 확인하세요"를 출력
		boolean check = true;
		if (check) {
			System.out.println("확인했습니다.");
		} else {
			System.out.println("다시 확인하세요.");
		}
		
		
		
		
		// 실습, 삼항 연산자
		// ﻿변수를 임의의 수로 초기화하고 값이 양수면 "양수", 음수면 "음수"를 출력하기
		int num3 = 10;
		String state = (num3>0) ? "양수" : "음수";
		System.out.println(state);
		
		
		// 실습, 삼항 연산자
		// ﻿x와 y의 크기가 같으면 "크기가 같다", 다르면 "값이 다르다"를 출력
		int x = 5;
		int y = 7;
		String state2 = (x==y) ? "크기가 같다." : "값이 다르다.";
		System.out.println(state2);
		
		
		

		// 실습, 중첩 if
		// 과자의 개수를 입력 받아 금액을 출력
		// 과자의 개당 가격은 2000원, 10개 초과하면 개당 1500원으로 받는다.
		System.out.print("과자 개수를 입력하세요 : ");
		int number = input.nextInt();
		
		int snack = 2000;
		int pay = 0;
		if (number > 10) {
			snack = 1500;
			pay = number*snack;
			System.out.println("총 금액 : "+pay);
		} else {
			pay = number*snack;
			System.out.println("총 금액 : "+pay);
		}
		
		
		// 실습, 중첩 if		
		// 3개의 정수값을 입력받고, 최대값과 최소값을 출력하세요
		int a, b, c;
		
		// input을 넣기 전에 임의로 값을 설정하고 테스트한 뒤에 input을 넣으면 편하다.
		System.out.print("숫자를 입력하세요 : ");
		a = input.nextInt(); 
		b = input.nextInt();
		c = input.nextInt();
		
		if (a>b) {
			// a > b이므로 현재 max = a;
			if (a>c) {  // 조건문을 (max > c)
				System.out.println("최대값 : "+a); // max(a) > b, c
				if (b>c) {  // b와 c 중 최소값 구하기
					System.out.println("최소값 : "+c); // a > b > c
				} else {
					System.out.println("최소값 : "+b); // a > c > b
				}
			} 
			else { 
				// c > max(a)이므로 c > a > b
				System.out.println("최대값 : "+c);
				System.out.println("최소값 : "+b);
			}
		} 
		else {  
			// b > a이므로 현재 max = b;
			if (b>c) {  // 조건문을 (max > c)
				System.out.println("최대값 : "+b); // max(b) > a, c
				if (a>c) {  // a와 c 중 최소값 구하기
					System.out.println("최소값 : "+c); // b > a > c	
				}
				else {
					System.out.println("최소값 : "+a); // b > c > a
				}
			} else {  
				// c > max(b)이므로 c > b > a
				System.out.println("최대값 : "+c);
				System.out.println("최소값 : "+a);
			}
		}
		
		
		// 실습, 중첩 if
		// 홀수 짝수, 음수 양수 판단
		// 정수값을 입력받고 홀수-짝수 출력 후, 음수-양수 출력하기
		System.out.print("숫자를 입력하세요(0 제외) : ");
		int num4 = input.nextInt();
		if (num4%2 == 0) {
			System.out.println("짝수");
			if (num4>0) {
				System.out.println("양수");
			} else {
				System.out.println("음수");
			}
		} else {
			System.out.println("홀수");
			if (num4>0) {
				System.out.println("양수");
			} else {
				System.out.println("음수");
			}
		}
		
		/* 
		 * if 조건식을 위(짝수, num4==0)와 달리 홀수 조건식으로 적을 때
		 * num4%2==1만 있을 경우, num4%2의 값이 -1로 나올 때도 
		 * "홀수"임에도 "짝수"로 출력된다.
		 * 때문에 논리연산자(||)를 사용해 num4%2==-1의 조건식도 추가한다.
		 */
		if (num4%2==1 || num4%2==-1) {
			System.out.println("홀수");
			if (num4>0) {
				System.out.println("양수");
			}
			else {
				System.out.println("음수");
			}
		}
		else {
			System.out.println("짝수");
			if (num4>0) {
				System.out.println("양수입니다.");
			}
			else {
				System.out.println("음수입니다.");
			}
		}
		
		
		// 실습, 중첩 if
		/* 학점 계산
		 * 점수와 학년을 입력 받아 60점 이상이면 합격, 미만이면 불합격 출력
		 * 단, 4학년은 70점 이상이어야 합격. 60점 이상인 경우 4학년을 구분하여 처리
		 * 학년은 1학년부터 4학년까지 있다.
		 */
		System.out.print("학년을 입력하세요 :");
		int grade = input.nextInt();
		System.out.print("점수를 입력하세요 :");
		int score1 = input.nextInt();
		
		if (score1>=60) {
			if (grade == 4) {
				if (score1>=70) {
					System.out.println(score1+" : 합격(4학년)");
				} else {
					System.out.println(score1+" : 불합격(4학년)");
				}
			} else {
				System.out.println(score1+" : 합격");
			}
		} else {
			System.out.println(score1+" : 불합격");
		}
		
		
		// 실습, 중첩 if
		/* 놀이공원 입장
		 * 나이를 입력 받고 나이가 15세 초과면 "입장이 가능합니다"를 출력
		 * 나이가 15세 이하면 부모님과 함께 왔는지(같이 왔으면 1, 아니면 0)을 입력받고
		 * 같이 왔으면 "입장이 가능합니다", 아니면 "보호자와 함께 입장해야합니다"를 출력
		 */
		int age1=0, pass=0;
		
		System.out.print("나이를 입력하세요 : ");
		age1 = input.nextInt();
		if (age1 > 15) {
			System.out.println("입장이 가능합니다.");
		}
		else {
			System.out.print("부모님과 함께 왔습니까? (예 1, 아니오 0) : ");
			pass = input.nextInt();
			if (pass==1) {
				System.out.println("입장이 가능합니다.");
			} else {
				System.out.println("보호자와 함께 입장해야 합니다.");
			}
		}
		
		
		
		
		// 실습, if - if else - else문
		// 음수, 양수, 0 판별하고 ﻿"양수입니다, 음수입니다. 0입니다" 출력하기
		int num5 = 0;
		if (num5>0) {
			System.out.println("양수입니다.");
		}
		else if (num5<0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0 입니다.");
		}
		
		
		// 실습, 연속적 if - else if - else문
		// 학점계산
		// ﻿점수를 입력 받아, 90점 이상이면 A, 80점 이상이면 B, 
		// 70점 이상이면 C, 그 미만의 점수를 F를 출력
		System.out.print("점수를 입력하세요 : ");
		int score2 = input.nextInt();
		
		if (score2>=90) {
			System.out.println("A학점입니다.");
		}
		else if (score2>=80) {
			System.out.println("B학점입니다.");
		}
		else if (score2>=70) {
			System.out.println("c학점입니다.");
		}
		else {
			System.out.println("F학점입니다.");
		}
		
		
		// 실습, 연속적 if - else if - else문
		// 미세먼지 판별기
		// 0~30 좋음, 31~80 보통, 81~150 나쁨, 151~ 매우나쁨
		int dust = 100; // 미세먼지 값 임의 지정
		
		if (dust>=0 && dust<=30) {
			System.out.println("좋음");
		}
		else if (dust<=80) {
			System.out.println("보통");
		}
		else if (dust<=150) {
			System.out.println("나쁨");
		}
		else {
			System.out.println("매우나쁨");
		}
		
		
		
		
		// 실습, switch문
		// ﻿0~6 사이의 임의의 정수값으로 초기화 한 후
		// ﻿switch를 이용해서 숫자마다 요일 출력
		//﻿ 0 : 월, 1 : 화, 2 : 수, 3 : 목, 4 : 금, 5 : 토, 6: 일
		int data = 3;
		switch (data) {
		case 0:
			System.out.println("월");
			break;
		case 1:
			System.out.println("화");
			break;
		case 2:
			System.out.println("수");
			break;
		case 3:
			System.out.println("목");
			break;
		case 4:
			System.out.println("금");
			break;
		case 5:
			System.out.println("토");
			break;
		case 6:
			System.out.println("일");
			break;
		default:
			System.out.println("없는 요일 입니다.");
		}
		
		
		// 실습, switch문
		// ﻿임의 정수값으로 초기화 한 후 90점 이상이면 A, 80점 이상이면 B,
		// ﻿70점 이상이면 C, 그 미만의 점수는 F 출력
		// ﻿10, 9 : A, 8 : B, 7 : C
		int score3 = 85;
		int scoreCase = score3/10;
		
		switch (scoreCase) {
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		
		// 실습, switch문
		// 카페 메뉴를 입력받고, 메뉴 이름과 가격 출력하기
		// 커피 2000, 아이스티 2500, 녹차 1500
		// 없는 종류를 선택했을 때, "(이름)의 제품은 없습니다" 출력하기
		System.out.print("메뉴를 입력하세요 : ");
		String name1 = input.next();
		
		switch (name1) {
		case "커피" :
			System.out.println("커피 2000원");
			break;
		case "아이스티" :
			System.out.println("아이스티 2500원");
			break;
		case "녹차" :
			System.out.println("녹차 1500원");
			break;
		default :
			System.out.println(name1+"의 제품은 없습니다.");
			break;
		}
		
		
	}

}
