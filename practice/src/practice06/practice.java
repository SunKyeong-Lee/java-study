package practice06;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 조건문
		// 90 이상은 장학금, 60 이상은 합격, 60 미만은 재시험으로 출력
		int score = 0;
		
		if (score>=90) {
			System.out.println("장학금");
		} else if (score>=90) {
			System.out.println("합격");
		} else {
			System.out.println("재시험");
		}
		
		
		// 반복문 while, break
		// 숫자 0이 들어올 때까지 입력받고 0이 들어오면 모든 숫자를 더한 수와 평균을 출력
		Scanner input = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("0을 입력하면 모든 수의 합과 평균을 출력합니다. : ");
			int inputNum = input.nextInt();
			sum += inputNum;
			if (inputNum==0) {
				break;
			}
			count++; // inputNum이 0일 때, 그 값을 더하지 않기 위함.
		}
		System.out.println("합 : "+sum+" 평균 : "+(sum/count));
		
		
		// 반복문 for
		// (int)(Math.random()*100) 을 이용해서 더하기 문제를 5번 제출
		for (int i=0; i<5; i++) {
			int x = (int)(Math.random()*100);
			int y = (int)(Math.random()*100);
			System.out.print(x+" + "+y+" = "); // 문제 출력
			int result = input.nextInt(); // 정답 입력받아오기
			if (result == x+y) { // 정답비교
				System.out.println("정답입니다!");
			} else {
				System.out.println("땡!");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		
		
		// 배열 {망고, 복숭이, 자두, 포도, 사과}를 하나씩 출력
		String[] fruits = {"망고", "복숭아", "자두", "포도", "사과"};
		for (int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]+"가 있습니다.");
		}
		
		
		// 3의 배수와 5의 배수가 아닌 수를 1~100까지 출력
		for (int i=0; i<=100; i++) {
			if (i%3!=0 && i%5!=0) { // !(i%3==0 || i%5==0)
				System.out.print(i+" ");
			}
			if (i%10==0) {
				System.out.println();
			}
		}
		
		
		// 배열 { 40, 60, 80, 100, 70 }을 작성한 후
		// 평균과 평균을 보다 큰 수를 출력
		int[] num = {40, 60, 80, 100, 70};
		int sum2 = 0;
		int avrg = 0;
		
		for (int a : num) {
			sum2 += a;
		}
		
		avrg = sum2/num.length;
		System.out.println("평균 : "+avrg);
		System.out.print("평균보다 큰 수 : ");
		
		for (int a : num) {
			if (a > avrg) {
				System.out.print(a+" ");
			}
		}
		
	}

}
