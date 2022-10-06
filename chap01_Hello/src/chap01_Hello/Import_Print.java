package chap01_Hello;

import java.util.Scanner; // Scanner 클래스 포함

public class Import_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a; // 변수의 선언 : 변수 a를 지금부터 사용하겠다고 선언
		a = 1; // 변수의 초기화 : 변수 a에 숫자 1을 할당
		int b = 1; // 변수의 선언과 동시에 초기화
		
		final int c = 10; // 상수는 선언과 동시에 반드시 초기화해야 한다.
		
		int x = 0;
		System.out.println(x);
		System.out.print("숫자를 입력하세요 : "); // 입력 안내 출력
		
		//Scanner 입력하고 Ctrl + space 해서 Scanner 추가
		Scanner input = new Scanner(System.in);
		x = input.nextInt(); // 사용자로부터 첫 번째 정수를 읽는다.
		System.out.println(x);
		System.out.println("출력했습니다.");
		
		System.out.println(x+1); // 1과 사용자가 입력한 수가 더해져서 나옴
		
		System.out.print(7); // print() 메소드는 줄 바꿈을 하지 않음
		System.out.println(3);
		System.out.println(3.14);
		System.out.println("자바");
		System.out.println("문자열끼리의"+" 연결도 가능하다.");
		System.out.println("숫자"+3+"과 문자열의 연결도 가능하다.");
		
	}

}




