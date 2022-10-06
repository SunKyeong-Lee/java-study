package chap07_2_array;

import java.util.Scanner;

import chap07_2_getset.AnimalCard;

public class AnimalCardArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열에서 정적 변수 활용
		AnimalCard a1 = new AnimalCard();
		AnimalCard a2 = new AnimalCard();
		AnimalCard a3 = new AnimalCard();
		// 객체가 생성될 때마다 1씩 증가함
		System.out.println(AnimalCard.getCardCount());  // 3
		
		// 정적 변수로 만든 상수로 배열 길이를 지정할 수 있다.
		AnimalCard[] cards2 = new AnimalCard[AnimalCard.MAX_CARD];
		// 배열 안의 인덱스[0]의 객체 생성
		cards2[AnimalCard.getCardCount()] = new AnimalCard(); 
		// 배열 안의 인덱스[1]의 객체 생성
		cards2[AnimalCard.getCardCount()] = new AnimalCard(); 
		
		
		
		
		// 실습, 진료카드 만들기(콘솔)
		// 1. 선택을 통해서 내용 확인 (=진행 작업 선택)
		// 1)진료카드 개수, 2)진료카드 내용 확인, 3)진료카드 작성, 0)종료
		// 2. 카드의 개수가 100일 경우 만들 수 없음
		AnimalCard[] cards = new AnimalCard[AnimalCard.MAX_CARD];
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.진료카드 개수 2.진료카드 내용확인 "
					+ "3.진료카드 작성 0.종료 : ");
			int option = input.nextInt();
			
			if (option == 1) {
				// 진료카드의 개수는 정적변수인 cardCount 내용 확인
				System.out.println("현재 진료카드의 개수는 "
							+AnimalCard.getCardCount()+"개 입니다.");
			}
			else if (option == 2) {
				// 작성된 전체 진료카드 내용 확인
				// 배열의 길이가 아니라 현재 작성된 진료카드의 개수로 확인
				for (int i=0; i<AnimalCard.getCardCount(); i++) {
					cards[i].printAnimalCard();
				}
				
				// 인덱스 값을 통해서 하나만 확인하는 내용
				System.out.print("확인할 진료카드 인덱스를 적어주세요. : ");
				int index = input.nextInt();
				if (index>=0 && index<AnimalCard.getCardCount()) {
					cards[index].printAnimalCard();
				} else {
					System.out.println("존재하지 않는 카드입니다.");
				}
			}
			else if (option == 3) {
				// getCardCount = 100 까지 가능
				// 100이 되었을 때 더이상 추가할 수 없습니다를 출력
				// 아래 내용(진료카드 추가) 실행하지 않음
				if (AnimalCard.getCardCount() == 100) {
					System.out.println("더 이상 진료카드를 작성할 수 없습니다.");
					continue;
				}
				
				// 새 진료카드 추가 - 입력
				System.out.print("동물의 종류, 이름, 개월 수를 작성하세요 : ");
				String animal = input.next();
				String name = input.next();
				int month = input.nextInt();
				// 인덱스 값을 전체 카드의 개수로 넣어서 사용
				cards[AnimalCard.getCardCount()] 
						= new AnimalCard(animal, name, month);
				
				System.out.println("작성이 완료되었습니다.");
			}
			else if (option == 0) {
				System.out.println("진료카드를 종료합니다.");
				break;
			}
		}
		
	}

}
