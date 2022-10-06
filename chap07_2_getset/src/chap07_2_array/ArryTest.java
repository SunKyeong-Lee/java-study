package chap07_2_array;

import java.util.Scanner;

import chap07_2_getset.AnimalCard;

public class ArryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 직접 작성한 클래스를 배열에 넣어서 사용 가능
		// 직접 작성한 클래스를 배열로 만들어서 쓸 때, new를 두번 사용
		
		// 1. 배열 생성
		// 지금 작성하는 객체는 배열의 객체
		AnimalCard[] cards = new AnimalCard[10];
		
		// 2. 배열 안의 각각의 클래스객체 생성
		//배열 안의 객체는 따로 생성해야 함
		cards[0] = new AnimalCard();
		System.out.println(cards[0].getMonth()); // 0
		
		// System.out.println(cards[1].getMonth());
		// 배열 안의 인덱스[1]의 객체가 생성되지 않았기 때문에 
		// NullPointer 에러가 뜬다.
		
		// 클래스객체의 배열의 경우 for문을 이용하여 클래스객체 생성
		// 위처럼 하나씩 생성하면 비효율적이기 때문
		for (int i=0; i<cards.length; i++) {
			cards[i] = new AnimalCard();
		}
		
		cards[0].setAnimal("강아지");
		cards[0].setName("콩이");
		cards[0].printAnimalCard();
		
		// 콘솔에서 값 입력받아서 넣어주기
		Scanner input = new Scanner(System.in);
		System.out.print("동물의 종류와 이름과 개월을 작성하세요 : ");
		String animal = input.next();
		String name = input.next();
		int month = input.nextInt();
		
		cards[1].setAnimal(animal);
		cards[1].setName(name);
		cards[1].setMonth(month);
		cards[1].printAnimalCard();
		
		
		
		
		// 연습 : AnimalCard클래스의 객체 배열을 만들고 그 안에 값을 넣기
		// 배열의 길이는 3, 값은 아무 값으로 넣기(Scanner x)
		AnimalCard[] animalCards = new AnimalCard[3];
		
		for (int i=0; i<animalCards.length; i++) {
			animalCards[i] = new AnimalCard();
		}
		
		animalCards[0].setAnimal("앵무새");
		animalCards[0].setName("앙꼬");
		animalCards[0].setMonth(3);
		
		animalCards[1] = new AnimalCard("햄스터", "뵤", 8);
		animalCards[2] = new AnimalCard("고양이", "야통이", 12);
		
		// 내용 출력을 위한 for - each문
		for (AnimalCard card : animalCards) {
			card.printAnimalCard();
		}

	}

}
