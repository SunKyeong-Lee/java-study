package chap07_object_String;

import java.util.Scanner;

public class StringTestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 실습, String 객체와 메소드
		// String 문자열 "2022-08-05"
		// for문을 이용하여 "-"을 "."로 바꿔서 문자열 출력하기
		String data = "2022-08-05";
		
		// 문자열 메소드는 문자열 값을 직접 바꾸지 않는다.
		for (int i=0; i<data.length(); i++) {
			if (data.charAt(i) == '-') {
				// 메소드는 필드값이 아니기에 대입연산자를 이용해서 값을 수정할 수 없다.
				// date.charAt(i) = '.'; - 오류
				System.out.print(".");
				continue; // 없으면 .이 출력되고 -가 이어서 출력됨
			}
			System.out.print(data.charAt(i));
		}
		
		System.out.println(); // 출력 확인 용이
		
		// 실습, String 객체와 메소드
		// ﻿while문을 통해 입력받은 문자열을 allWord라는 변수에 이어서 붙이는 프로그램
		// ﻿"종료"를 입력받으면 반복문을 빠져나와 allWord에 들어간 문자열을 출력
		Scanner input = new Scanner(System.in);
		String allWord = "";
		String inputWord = "";
		
		while (!(inputWord.equals("종료"))) {
			System.out.print("단어를 입력하세요(반복을 멈추려면 종료) : ");
			inputWord = input.next();
			// allWord = allWord + inputWord와 동일한 결과
			allWord = allWord.concat(inputWord);
		}
		System.out.println("결과 확인 : "+allWord);
		
		
		
		// 실습, String 객체와 메소드
		// ﻿이름을 입력 받고, 이름의 가운데 값을 *로 대체하는 프로그램
		String s = "홍길동";
		System.out.print("이름을 입력하세요 : ");
		s = input.next();
		char middle = s.charAt(1);
		System.out.println(s.replace(middle, '*'));
		// 김김김을 입력하면 가운데 뿐만 아니라 모든 글자가 ***로 출력되지만,
		// String 메소드를 써보기 위함이니 여기까지만 작성한다.
		
		
		
		// 실습, String 객체와 메소드
		// 비밀번호를 입력 받고, 비밀번호가 맞으면 "문이 열렸습니다."
		// 틀리면 "틀렸습니다. 기회가 (반복 횟수)번 남았습니다"를 출력하기
		// 반복 횟수 : 5
		// 반복횟수가 0이면 "10분 후 다시 시도해주세요"라고 출력하기
		String password = "";
		int count = 5;
		
		while (count>0) {
			System.out.print("비밀번호를 입력하세요 : ");
			password = input.next();
			if (!(password.equals("1111"))) {
				count--;
				System.out.println("틀렸습니다. 기회가 "+count+"번 남았습니다.");
			} else {
				System.out.println("문이 열렸습니다.");
				break;
			}
			if (count == 0) {
				System.out.println("10분 후 다시 시도해주세요.");
			}
		}
		
		
		
		
		
		// 실습, 랩퍼클래스
		// Integer.perseInt() : 문자열을 정수로
		
		String birthDay = "0108";
		System.out.println(birthDay); // 0108 출력 (문자열)
		
		// 전체를 숫자로 바꿈
		int birthDayNum = Integer.parseInt(birthDay);
		System.out.println(birthDayNum); // 108 출력 (정수형으로 바껴서 맨 앞의 0이 생략됨)
		
		// 달과 일을 잘라서 숫자로 바꿈
		// substring을 이용하여 글자를 자름
		String month = birthDay.substring(0, 2); // 01 출력 (문자열, 인덱스[0~1]의 값 출력)
		// 자른 글자를 숫자로 바꿔줌
		int birthDayMonth = Integer.parseInt(month); // 1 (정수형)
		System.out.println(birthDayMonth+"월"); // 1월 출력
		
		// 글자에서 일자의 자리만큼 잘라줌
		String day = birthDay.substring(2); // 08 (문자열, 인덱스[2~3]의 값 출력)
		// 자른 글자를 숫자로 바꿔줌
		int birthDayDay = Integer.parseInt(day); // 8 (정수형)
		System.out.println(birthDayDay+"일"); // 8일 출력


	}

}
