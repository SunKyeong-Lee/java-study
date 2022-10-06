package chap03_operator;

import java.util.Scanner;

public class OperatorEx {

	/**
	 * 연산자 실습 모음 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 산술 연산자 1
		// 자료형 int를 사용하여 변수 sum1을 선언
		// 10+20+30+40+50의 값을 할당 또는 초기화
		
		// 자료형 int를 사용하여 변수 mult1을 선언
		// 10*20*30*40*50의 값을 할당 또는 초기화
		
		// 자료형 int를 사용하여 변수 sum2을 선언
		// 10*(20+30)+40의 값을 할당 또는 초기화

		int sum1, mult1, sum2;
		sum1 = 10+20+30+40+50;
		mult1 = 10*20*30*40*50;
		sum2 = 10*(20+30)+40;
		
		System.out.println(sum1); // 150
		System.out.println(mult1); // 12000000
		System.out.println(sum2); // 540
		
		
		// 단항 연산자
		int minusX = 1;
		int minusY = 1;
		
		// 후위연산자를 사용해서 먼저 값이 출력된 후에 1이 감소한다.
		System.out.println(minusX--); // 1
		System.out.println(minusX); // 0
		
		// 전위연산자를 사용해서 값을 1 감소한 후에 출력된다.
		System.out.println(--minusY); // 0
		System.out.println(minusY); // 0
		
		
		// 복합 대입 연산자 사용방법 (*=, /=, %=, +=, -=)
		int mult2 = 1;
		
		// mult2 = mult2*10;
		mult2 *= 10; // 곱셈과 대입 연산자를 복합해서 사용
		System.out.println(mult2);

		
		// 복합 대입 연산자
		// sum = sum + 10식을 복합 대입 연산자를 이용하여 계산한 후
		// sum 값을 출력
		int sum = 0;
		sum += 10;
		System.out.println(sum); // 10출력
		
		// mult = mult*20식을 복학 대입 연산자를 이용하여 계산한 후
		// mult 값을 출력
		int mult = 1;
		mult *= 20;
		System.out.println(mult); // 20 출력
		
		
		// 대입, 산술, 복합 대입
		// 커피가게 총 매출 계산하는 프로그램 만들어보고 계산하기
		// 아메리카노 = 2000, 카페라떼 = 3000, 카푸치노 = 3500
		// 아메리카노 3개, 카페라떼 3개, 카푸치노 3개
		int americano = 2000;
		int cafelatte = 3000;
		int cappuccino = 3500;
		
		int pay = 0;
		pay = americano*3 + cafelatte*3 + cappuccino*3;
		System.out.println(pay); // 25500 출력
		
		
		// 나머지의 몫, 나머지를 사용하여 5642초를 몇분 몇초인지 계산하기
		int m = 5642/60; // 94
		int s = 5642%60; // 2
		int h = m/60; // 1
		m %= 60; // 60분이 넘었기 때문에 나머지 연산자를 사용해서, 0~59분의 값을 얻기 위함
		System.out.println(h+"시간 "+m+"분 "+s+"초"); // 1시간 34분 2초
		
		
		// Scanner를 사용하여 값 2개를 입력 받은 후
		// 두 개의 값을 나눈 몫과 나머지 출력하기
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 값을 입력하세요 : ");
		int num1 = input.nextInt();
		System.out.print("두 번째 값을 입력하세요 : ");
		int num2 = input.nextInt();
		
		int div = num1/num2;
		int rest = num1%num2;
		System.out.println("몫 : "+div+", 나머지 : "+rest);
		
		
		// 관계 연산자
		// x = 63*4, y = 38*6 값을 넣고 비교 연산자를 이용하여 비교한 결과를 출력하기
		int x = 63*4;
		int y = 38*6;
		System.out.println(x == y); // false
		System.out.println(x != y); // true
		System.out.println(x > y); //true
		System.out.println(x < y); // false
		System.out.println(x >= y); // true
		
		
		// 실습 5
		// Scanner를 사용하여 가로 길이를 입력 받으면
		// 면적이 1000에 가깝게 하는 세로 길이를 계산해서 출력 (항상 정수 결과 출력)
		// 면적(사각형의 넓이) = 가로(w) x 세로(h)
		System.out.print("가로 길이를 입력하세요(100을 넘어서는 안됨) : ");
		int width = input.nextInt();
		int height = 1000/width;
		System.out.println("세로 길이 : "+height);
		
		// 실수로 계산하고 싶다면
		double doubleHeight = 1000.0/width; // 하나의 값이 실수면 결과도 실수
		System.out.println("세로 길이(실수) : "+doubleHeight);
		
		
		// 실습 6
		// Scanner를 사용하여 
		// 이름(문자열)을 입력받으면 "반갑습니다. 000님" 출력하기
		// 온도(정수)를 입력받으면 "현재 체온 00도 입니다. 427 강의실 입니다." 출력하기
		System.out.print("이름을 입력하세요 : ");
		String name = input.next(); // String 값을 가져오는 메소드
		System.out.println("반갑습니다. "+name+"님.");
		
		System.out.print("온도를 입력하세요 : ");
		double t = input.nextDouble(); // 계산하는게 아니기 때문에 String으로 해도 괜찮다.
		String classNum = "427";
		System.out.println("현재 체온 "+t+"도 입니다. "+classNum+"강의실 입니다.");
		
		// 실습 7
		// 놀이기구를 타기 위해서는 6세 이상, 키 140 이상이어야 한다.
		// 논리식을 사용해서 탈 수 있는지 아닌지 확인해보자.
		int age = 9;
		int height1 = 140;
		System.out.println(age>=6 && height1 >=140); // true 출력
		
	}

}
