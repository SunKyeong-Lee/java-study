package chap06_array;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 실습, 배열
		// double의 배열 초기화
		// double 배열을 선언 후, 학생들의 키 값 5개를 넣어 초기화
		// for문을 통해 모든 값을 더한 후, 학생 키의 평균을 구하기
		double[] heights = {160.3, 155.7, 168.1, 172.5, 180.3};
		double sum = 0;
		for (int i=0; i<heights.length; i++) {
			sum += heights[i];
		}
		double avrg = sum/heights.length;
		System.out.println("학생 평균키("+heights.length
				+") : "+String.format("%.1f", avrg));

		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, 배열
		// 값을 5개 갖는 double 배열을 선언한 후, 
		// for문과 Scanner를 통해 값을 받아 각 배열에 저장하고 출력.
		// 출력할 때, 체온이 37 이상이면 숫자 앞에 "(위험)"이라는 문자열을 같이 출력하기
		Scanner input = new Scanner(System.in);
		double[] temparatures = new double[5];
		for (int i=0; i<temparatures.length; i++) {
			System.out.print("체온을 입력하세요 : ");
			temparatures[i] = input.nextDouble();
		}
		
		// for - each
		for (double temparature : temparatures) {
			if (temparature>=37) {
				System.out.println("(위험) "+temparature);
			} else {
				System.out.println(temparature);
			}
		}

		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, 배열
		// Scanner를 사용해 학생의 수를 입력 받고, 받은 수로 점수 배열을 선언(int)
		// for문을 통해 Scanner를 사용하여 점수 배열 안에 학생의 성적 값을 초기화
		// for - each문을 통해, 60점 이상인 점수만 출력
		System.out.print("학생 수를 입력하세요 : ");
		int student = input.nextInt();
		int[] studentScores = new int[student];
		
		// 배열의 크기가 입력받은 학생 수라 이미 int student로 선언했기 때문에
		// studentScroes.length를 안쓰고 student를 씀 
		for (int i=0; i<student; i++) {
			System.out.print("점수를 입력하세요 : ");
			// 배열 요소에 인덱스를 통하여 직접 접근하여 값 할당
			studentScores[i] = input.nextInt();
		}
		
		for (int score : studentScores) {
			if (score>=60) {
				System.out.println(score);
			}
		}
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, 배열
		// ﻿String 배열을 바나나, 딸기, 포도, 사과, 키위로 초기화
		// ﻿Scanner를 이용하여 과일 이름을 입력 받고
		// 배열 안에 있는 과일이면, "(과일 이름)이 있습니다."를 출력
		// ﻿아니면 "없습니다"를 출력
		String[] fruits = {"바나나","딸기","포도","사과","키위"};
		System.out.print("과일 이름을 입력하세요 : ");
		String fruitInput = input.next();
		
		// 하나가 아닌 배열 안의 여러 개를 비교해야 할 때 : for문 혹은 switch문
		for (int i=0; i<fruits.length; i++) {
			// 입력받은 값과 for문으로 배열을 하나씩 비교
			if (fruitInput.equals(fruits[i])) {
				System.out.println(fruitInput+"가 있습니다.");
			} else {
				System.out.println("없습니다.");
				break;
			}
		}
		
		// 있는지 없는지 확인만 하는 for문
		boolean isFruit = false;
		for (int i=0; i<fruits.length; i++) {
			if (fruitInput.equals(fruits[i])) {
				isFruit = true;
				break;
			}
		}
		
		// 위에서 확인한 값을 가지고 출력
		if (isFruit) {
			System.out.println(fruitInput+"가 있습니다.");
		} else {
			System.out.println("없습니다.");
		}
		
		
		System.out.println(); // 출력 확인 용이
		
		
		// 실습, 2차원 배열
		// 영어 단어와 뜻 출력하기
		String[][] words 
		= { {"char","의자"},{"computer","컴퓨터"},{"integer","정수"} };
		for (int i=0; i<words.length; i++) {
			for (int j=0; j<words[i].length; j++) {
				System.out.print(words[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
