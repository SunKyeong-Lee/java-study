package test0802;

import java.util.Scanner;

public class Test0802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단
		// ﻿2~9까지의 수를 입력을 받고 입력받은 수에 대한 구구단을 출력
		// ﻿2~9 이외의 숫자가 들어오면 “구구단에 등록된 수가 아닙니다”를 출력
		Scanner input = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요(2~9) : ");
		int dan = input.nextInt();
		
		if (dan>=2 && dan<=9) {
			for (int i=1; i<=9; i++) {
				System.out.println(dan+" x "+i+" = "+dan*i);
			}
		} else {
			System.out.println("구구단에 등록된 수가 아닙니다.");
		}
		
		
		
		
		
		// 메뉴 선택
		System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
		int num = input.nextInt();
		
		// while
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

		
		
		// do while
		do {
			System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			num = input.nextInt(); // 위에 이미 int num 값을 지정해줘서 여기서는 안 적음
			if (num == 1) {
				System.out.println("짜장을 선택하였습니다.");
			}
			else if (num == 2) {
				System.out.println("짬뽕을 선택하였습니다.");
			}
			else if (num == 3) {
				System.out.println("탕수육을 선택하였습니다.");				
			}
		} while (num!=0);
		System.out.println("종료되었습니다.");
		

		
		
		// switch
		do {
			System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			num = input.nextInt(); // 위에 이미 int num 값을 지정해줘서 여기서는 안 적음
			switch (num) {
			case 1:
				System.out.println("짜장을 선택하였습니다.");
				break;				
			case 2:
				System.out.println("짬뽕을 선택하였습니다.");
				break;
			case 3:
				System.out.println("탕수육을 선택하였습니다.");
				break;
			case 0:
				System.out.println("종료되었습니다.");
				break;
			}
		} while (num!=0);
		
		
	}

}
