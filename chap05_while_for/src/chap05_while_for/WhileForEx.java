package chap05_while_for;

import java.util.Scanner;

public class WhileForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 실습, while문
		// 10 ~ 1 카운트다운 출력
		int countDown = 10;
		while (countDown>0) {
			System.out.println(countDown);
			countDown--;
		}
		
		
		System.out.println(); // 출력 확인 용이

		
		// 실습, while문
		// 1~100까지의 전체합, 짝수의 합, 홀수의 합을 구해서 출력
		int sum, even, odd;
		int num = 1;
		sum = 0;  // 전체 합
		even = 0;  // 짝수 합
		odd = 0;  // 홀수 합
				
		while (num<=100) {
			// 전체 합
			sum += num;
			// 짝수의 합, 홀수의 합
			if (num%2==0) {
				even += num;
			} 
			else {
				odd += num;
			}
			num++; // 1씩 증가함. 101이 되면 벗어나기 위해 (보통은 이걸 쓰나)
				   // num2 += 2 >> 1에서 2씩 증가하게 됨 (다른 수 증가를 하고 싶다면 이거)
		}
		// 반복이 끝난 후에 확인을 하려면, while문 밖에 작성
		System.out.println("전체 합 : "+sum);
		System.out.println("짝수 합 : "+even);
		System.out.println("홀수 합 : "+odd);
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, while문
		// 입력받은 모든 수를 더하는 프로그램
		// while문 사용 (조건, 반복내용)
		// 조건 - 0을 입력받을 때까지 모든 숫자 더함 : == 관계연산자를 사용
		// 0이 들어왔을 때(같을 때) : 반복 멈춤
		// 다른 수가 들어왔을 때 : 계속해서 모든 숫자를 더함
		// 반복 내용 - 모든 숫자를 더함 : sum변수를 통해 들어오는 값들을 더하여 저장
		Scanner input = new Scanner(System.in);
		
		System.out.print("더할 수를 입력하세요(0을 넣으면 종료) : ");
		int num1 = input.nextInt();
		int sum1 = 0;
		
		while (num1!=0) { // num이 0이 아닐 때, 반복
			// 1. 들어간 값을 더함
			sum1 += num1; // sum = sum + num;
			// 2. 다시 num을 비교하기 위해서 input으로 입력 받음
			System.out.print("더할 수를 입력하세요(0을 넣으면 종료) : ");
			num1 = input.nextInt();
		}
		System.out.println("총 더한 값 = "+sum1);
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, while문
		// 종료를 입력하면 종료하는 프로그램
		// 문자열 값을 입력 받아 입력값을 출력하고, 문자열의 값이 "종료"일 때 반복을 종료
		// 반복이 끝나면 "프로그램이 끝났습니다"를 출력
		System.out.println("종료를 입력하면 프로그램이 종료됩니다.");
		System.out.print("단어를 입력하세요 : ");
		String word = input.next();
				
		while (!word.equals("종료")) {
			System.out.println(word);
			System.out.print("단어를 입력하세요 : ");
			word = input.next();
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, while문
		// 구구단 4단 출력하기
		int dan = 4;
		int num2 = 1;
		
		while (num2<10) { // 9까지 출력하기 위한 조건
			System.out.println(dan+"x"+num2+"="+(dan*num2));
			num2++; // num1의 값을 증가시킴
		}
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, do while문
		// 변수 횟수에 원하는 값으로 초기화, 횟수만큼 " 쓰레기를 버리면 안됩니다" 경고문 출력
		// 단, 횟수가 0이라도 처음 한 번은 무조건 실행이 되어야 한다.
		int number = 0; // 경고문을 출력하고 싶은 만큼 값 초기화
		do {
			System.out.println("쓰레기를 버리면 안됩니다.");
			number--;
		} while (number>0);

		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, do while문
		// 업다운 게임 : 숫자를 입력하여 그 숫자가 맞을 때까지 반복해서 알려주는 프로그램
		// 반복 조건 - 59이 아니면 반복한다.
		// 반복 내용 - 입력 받은 값을 59와 비교해서 작은지 큰지 알려준다.
		int inputNum1 = 0;
		int count = 0;
				
		do {
			// 1. input을 이용해서 값을 입력 받음
			System.out.print("정답을 추측하여 보시오 : ");
			inputNum1 = input.nextInt();
					
			// 2. 입력 받은 값을 비교(if)해서 큰지 작은지 알려줌
			if (inputNum1>59) {
				System.out.println("제시한 점수보다 높습니다.");
			} else {
				System.out.println("제시한 점수보다 낮습니다.");
			}
			count++;  // 시도 횟수
		} while (inputNum1 != 59);
		// 정담은 반복문을 빠져나와서 한 번만 출력
		System.out.println("축하합니다. 시도횟수 = "+count);
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, for문
		// 팩토리얼(!) : 1부터 어떤 양의 정수 n까지의 정수를 모두 곱한 것
		// 20!의 값을 구하기
		long mult = 1;
		for (int num8=1; num8<=20; num8++) {
			mult *= num8;
		}
		System.out.println("20!의 값 : "+mult);
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, for문
		// 반복할 숫자를 입력받은 후
		// 두 숫자를 입력 받아 덧셈을 한다. 더해진 값은 바로 아래 출력
		int a = 0;
		int b = 0;
		int count1 = 0;
				
		System.out.print("더하기를 몇 번 반복할지 작성하세요 : ");
		a = input.nextInt();
				
		// 횟수만큼 반복해줄 때는 초기값을 0으로 많이 둔다.
		for (int i=0; i<=a; i++) {
			System.out.print("두 수를 띄워서 입력하세요 : ");
			a = input.nextInt();
			b = input.nextInt();
			System.out.println("결과 : "+(a+b));
		}
		System.out.println("종료되었습니다.");
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, for문과 조건
		// 1 ~ 100의 수 중, 3의 배수만을 출력하라
		for (int i=1; i<=100; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, for문과 조건
		// 1 ~ 100의 수 중, 3의 배수와 5의 배수의 합을 출력하라
		int sum3 = 0;
		for (int i=1; i<=100; i++) {
			if (i%3==0 || i%5==0) {
				sum3 += i;
			}
		}
		System.out.println("3의 배수와 5의 배수 합 : "+sum3);
		
		
		System.out.println(); // 출력 확인 용이

		
		// 실습, 중첩 반복문
		// 구구단 2 ~ 9단 출력
		for (int i=2; i<10; i++) {
			System.out.println("<"+i+"단>");
			for (int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
		
		
		System.out.println(); // 출력 확인 용이
		
		// 실습, 중첩 반복문
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+ … +(1+2+3+…+10)합을 출력
		// 숫자들도 같이 나오게 출력
		int sum4 = 0;
		int total = 0;
				
		for (int i=1; i<=10; i++) {
			// i의 값을 누적해서 더함 : 1, 1+2, 1+2+3...
			sum4 += i; 
			// sum의 값을 누적해서 더함 :  1 + (1+2) + (1+2+3) ...
			total += sum4;
					
			for (int j=1; i>=j; j++) {
				System.out.printf("%d ",j); // printf() 링크 참고
			}
			System.out.print("(합:"+sum4+")");
			System.out.println();
		}
		System.out.println("중첩 합 : "+total);
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, 중첩 반복문
		// 숫자값을 입력 받아서 별(*)을 n x n 박스로 출력
		System.out.print("숫자를 입력하세요 : ");
		int number1 = input.nextInt();
				
		for (int i=0; i<number1; i++) {
			for (int j=0; j<number1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// *을 계단 형태로 출력하기
		// WhileFor문의 계단 형태를 가로로 뒤집은 형태
		for (int i=1; i<=5; i++) { 
			// 공백 만들기
			for (int j=0; j<5-i; j++) {
				// 아래 *(띄어쓰기)를 했기 때문에 공백(띄어쓰기)를 해줘야 간격 맞음
				System.out.print("  ");
			}
			for (int k=0; k<i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
