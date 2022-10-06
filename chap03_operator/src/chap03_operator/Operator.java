package chap03_operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연산자
		// 대입 연산자와 산술 연산자
		int x, y;
		x = 10; // 상수 10을 변수 x에 대입한다.
		y = 3; // 상수 3을 변수 y에 대입한다.
		
		
		
		// 산술 연산자
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y); // int끼리 나눗셈은 int형으로 나옴
		System.out.println(x%y); // int끼리의 나머지는 int형으로 나옴
				
		// 대입 연산자 : 오른쪽의 식을 계산한 후에 변수에 대입
		// 계산식이 끝난 후에 값을 할당하기 때문에 
		// int형에서 double형으로 형변환만 하게 된다.
		double sum = x/y;
		System.out.println(sum);
		
		
		// int result;를 만들고 80/3, 80%3의 결과 확인하기
		int result, resultRest;
		result = 80/3;
		resultRest = 80%3;
		System.out.println(result); // 몫 26
		System.out.println(resultRest); // 나머지 2
		System.out.println(26*3+2); // 80이 나오므로 계산확인
		
		// 나머지 연산자의 계산 결과의 특징
		// 1. 항상 정수로만 나온다.
		// 2. 값의 범위가 정해져있다. (0~나누는 수)
		
		// double resultDouble;을 만들고 80.0/3.0의 결과 확인하기
		double resultDouble = 80.0/30.0;
		System.out.println(resultDouble); // 2.66666~ 소수점 자리까지 나옴
		
		// 연산자의 결합규칙
		// 11.5 > 실수형이 들어가 있어서 실수값이 나옴
		System.out.println(30.0/20+30-10*2);
		
		// 41 > 정수형이 들어가 있어서 정수값이 나옴
		// 괄호를 통해서 순서가 바뀌어서 값이 차이가 남
		System.out.println(30/20+(30-10)*2);
		
		
		
		// 단항연산자
		int a = +10; // + 붙여서 양수(붙이지 않아도 양수)
		int b = -10; // - 붙여서 음수
		System.out.println(a); // 10 출력
		System.out.println(b); // -10 출력
		
		// 전위 단항 연산자 (++, --)
		// 다른 연산을 하기 전에 1증가, 1감소 한다.
		int c = ++a; // 변수(a) 앞에 사용해서 a값이 증가한다.
		System.out.println(c); // 11 출력
		System.out.println(a); // 11 출력
		
		++a; // a값이 1증가 : 12
		System.out.println(a);
		
		--a; // a값이 1 감소 : 11
		System.out.println(a);
		
		// 후위 단항 연산자 (++, --)
		// 모든 연산이 끝난 후에 값을 1증가, 1감소 시킨다.
		int d = a++;
		System.out.println(d); // 11 : 값을 증가시키기 전에 들어간 값
		System.out.println(a); // 12 : 이후에 1을 증가시킴
		
		a++; // a의 값이 1 증가함 : 13
		System.out.println(a);
		
		
		// 복합 대입 연산자 (*=, /=, %=, +=, -=)
		// 동일한 변수안에서 값을 바꿔서 혹은 계산해서 사용할 때 쓰는 방법.
		
		// 10, 20, 30, 40 더해서 결과값 확인하기
		// int sum3 = 10+20+30+40; // 한꺼번에 더해서 계산하는 법
		
		// 만약에 한꺼번에 계산할 수 없고
		// 한 코드가 끝날 때 그 값을 추가해서 더해야하는 경우
		int sum3 = 0; // 처음 값
		System.out.println(sum3); // 0 출력
		
		sum3 += 10; // 0(sum3) + 10 
		System.out.println(sum3); // 10 출력
		
		sum3 += 20; // 10(sum3) + 20 = 30 
		sum3 += 30; // 30(sum3) + 30 = 60
		sum3 += 40; // 60(sum3) + 40 = 100
		System.out.println(sum3); // 100 출력
		
		
		// 관계 연산자 (==, !=, >, <, >=, <=)
		// 관계 연산자의 결과 값은 항상 참/거짓이다 (boolean값)
		System.out.println(10==10); // true
		System.out.println(10==100); // false
		
		int score = 50;
		// score 값이 60보다 크면 합격(true)
		System.out.println(score>60); // false, score값에 따라 결과가 바뀜
		
		score = 70;
		System.out.println(score>60); // true
		
		
		// 논리 연산자 (&&, ||, !)
		// 논리형(boolean > ture/false)을 계산하는 연산자
		boolean x1 = true;
		boolean y1 = false;
		
		// && : and연산자는 true && true 일 때 결과가 true로 나온다.
		// 하나라도 false 이면 결과가 false가 나온다.
		System.out.println(x1&&y1); // false
		
		// || : or연산자는 하나라도 true이면 결과가 true가 나온다.
		// false||false일 경우 결과가 false가 나온다.
		System.out.println(x1||y1); // true
		
		// ! not연산자를 사용하면 원래 값을 부정(반대)한 값이 나온다.
		System.out.println(!x1); // false
		System.out.println(!y1); // true
		
		
		// 실습 논리 연산자
		int x2 = 20;
		int y2 = 40;
		
		System.out.println(x2==20 && y2==20); // false 출력 (true  && false)
		System.out.println(x2==20 && y2==40); // true 출력 (true && true)
		
		System.out.println(x2==20 || y2==10); // true 출력 (true || false)
		System.out.println(x2==10 || y2==10); // false 출력 (false || false)
		
                          // true   // !false > true
		System.out.println(x2==20 && y2!=10); // true 출력
		
		// 괄호 안의 내용부터 계산 : x2==10은 false, false값을 부정해서 true가 나옴
		System.out.println(!(x2==10)); // true 출력

	}

}
