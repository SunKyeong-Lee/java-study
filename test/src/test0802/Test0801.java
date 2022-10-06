package test0802;

import java.util.Scanner;

public class Test0801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단 출력
		System.out.print("출력할 단을 입력하세요(2~9) : ");
		Scanner input = new Scanner(System.in);
		int dan = input.nextInt();
		
		for (int i = 1; i<10; i++) {
			if (dan>1 && dan<10) {
				System.out.println(dan+" x "+i+" = "+dan*i);
			} else {
			System.out.println("구구단에 등록된 수가 아닙니다.");
			break;
			}
		}
		
		
		
		
		// 메뉴 선택
		System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
		int num = input.nextInt();
		
		while (num!=0) {
			if (num == 1) {
				System.out.println("짜장을 선택하였습니다.");
			}
			else if (num == 2) {
				System.out.println("짬뽕을 선택하였습니다.");
			}
			else if (num == 3) {
				System.out.println("탕수육을 선택하였습니다.");				
			}
			System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			num = input.nextInt();
		}
		System.out.println("종료되었습니다.");

	}

}
