package chap02_var;

public class VariableEX {
	
	/**
	 * 변수 실습 모음
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 변수 선언
		// 사람의 나이(26), 일자(10), 금액(5000), 개수(5), 점수(100)
		int age = 26;
		int data = 10;
		int pay = 5000;
		int count = 5;
		int score = 100;
		System.out.println(age);
		System.out.println(data);
		System.out.println(pay);
		System.out.println(count);
		System.out.println(score);
		
		// long 변수
		// 빛의 지나간 거리가 9460800000000km 일 때, 몇 시간 동안 지나갔는지 구하시오.
		// 빛의 속도 : 300000(km/s)초속
		// 시간 = 거리/속도
		long distance = 9460800000000L; // int의 범위를 지난 값이라 L이 붙는다.
		long lightSpeed = 300000;
		// print() 메소드 안에 수식을 작성하면 계산하여 출력한다.
		System.out.println(distance/lightSpeed);
		
		
		
		
		// double형
		// 반지름이 10인 구의 부피를 double 자료형을 가진 변수에 할당
		// V = 4/3 x 3.14 x 반지름의 3제곱
		double volume = 4/3 * 3.14 * 10*10*10;
		System.out.println(volume); // 소수점이 포함되어서 나온다.
		
		// 3.14의 값을 double 자료형을 가진 변수에 할당
		double pi = 3.14;
		System.out.println(pi);
		
		
		
		
		// 기로 상수 final
		// 정육면체의 한 변의 길이를 기호 상수로 두고, 부피를 계산해서 출력
		// V = 한변의 길이 x 한변의 길이 x 한변의 길이
		// 모서리의 길이 값 4, 6, 10을 한번씩 넣어보면서 확인하기
		final int LINE = 4;
		int V = LINE*LINE*LINE; // 변수는 변수끼리 계산한 값도 할당할 수 있다.
		System.out.println(V);
		
		
		
		
		// int를 이용하여 (변수이름)number에 숫자값 10을 할당하세요.
		int number = 10;
		
		// boolean을 이용하여 isSunny에 true 값을 할당하세요.
		boolean isSunny = true;
				
		// char를 이용하여 char_a에 a 값을 갈당하세요
		char char_a = 'a';
				
		// String을 이용하여 sayHi에 hi를 할당하세요.
		String sayHi = "hi";
		System.out.println(sayHi); // 변수의 경우는 변수 이름만 넣어서 확인
				
		// 특수문자 : 쌍따옴표가 들어간 "Hello World" 출력하기
		String word2 = "\"Hello World\" \n\"Welcome\"";
		System.out.println(word2);

	}

}
