package chap05_break_continue;

import java.util.Scanner;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 실습, for문에서 break;
		// 1~100까지 출력하는 중 77까지 출력하고 멈추기
		// 10의 배수일 때 줄바꿈
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
			// 77을 출력하고 나오기 위해 syso.print(i+" ") 뒤에 작성
			// 위의 print(i+" ")보다 if문이 위에 있다면 76까지만 출력된다.
			if (i==77) {
				break;
			} 
			// 10의 배수일 때 줄바꿈 추가
			if (i%10==0) {
				System.out.println();
			}
		}
		
		
		
		
		// 실습, for문에서 break;
		// 50 ~ 1까지 출력하는 중 25가 되면 반복을 중단 (25 출력X)
		// 41, 31, 21, 11, 1에 줄바꿈
		for (int i=50; i>+1; i--) {
			if (i==25) {
				break;
			}
			System.out.print(i+" ");
			if (i%10==1) {
				System.out.println();
			}
		}

		

		
		// 실습 : while문에서 break;
		// while문의 조건을 true로 넣은 후, (무한 루프) 입력 받은 숫자를 출력
		// 0을 입력 받으면 반복을 멈춤
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		
		while (true) {
			System.out.print("숫자를 입력하세요.(0 종료) : ");
			num1 = input.nextInt();
			if (num1==0) {
				break;
			}
			System.out.println(num1);
		}
		
		
		
		
		// 실습 : while문에서 break;
		// while문의 조건을 true로 넣은 후, 
		// (무한 루프) 이름을 입력받고 "안녕하세요. 000님"을 출력
		// "종료"를 입력 받으면 반복을 멈춤
		String name;
		
		while (true) {
			System.out.print("이름을 입력하세요 : ");
			name = input.next();
			if (name.equals("종료")) {
				break;
			}
			System.out.println("안녕하세요. "+name+"님");
		}
		System.out.println("종료되었습니다.");
		
		
		
		
		// 실습, continue
		// 1~30까지 출력하는 중 3의 배수를 건너뛰고 출력하기
		for (int i=1; i<=30; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
