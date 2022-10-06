package chap08_1_inheirtAnimal;

import java.util.Scanner;
// 패키지가 달라져서 삭제
// import chap07_2_getset.AnimalCard;

public class AnimalCardArray {

	public static void main(String[] args) {
		
		// 진료카드(콘솔)
		// 새 기능을 추가하기 위해 AnimalCard를 AnimalCardNew로 수정
		AnimalCardNew[] cards = new AnimalCardNew[AnimalCard.MAX_CARD];
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.진료카드 개수 2.진료카드 내용확인 "
					+ "3.진료카드 작성 0.종료 : ");
			int option = input.nextInt();
			
			if (option == 1) {
				// AnimalCard를 AnimalCardNew로 수정
				System.out.println("현재 진료카드의 개수는 "
							+AnimalCardNew.getCardCount()+"개 입니다.");
			}
			else if (option == 2) {
				// AnimalCard를 AnimalCardNew로 수정
				// 아래 print는 아님
				for (int i=0; i<AnimalCardNew.getCardCount(); i++) {
					cards[i].printAnimalCard();
				}
				
				// AnimalCard를 AnimalCardNew로 수정
				// 아래 print는 아님
				System.out.print("확인할 진료카드 인덱스를 적어주세요. : ");
				int index = input.nextInt();
				if (index>=0 && index<AnimalCardNew.getCardCount()) {
					cards[index].printAnimalCard();
				} else {
					System.out.println("존재하지 않는 카드입니다.");
				}
			}
			else if (option == 3) {
				// AnimalCard를 AnimalCardNew로 수정
				if (AnimalCardNew.getCardCount() == 100) {
					System.out.println("더 이상 진료카드를 작성할 수 없습니다.");
					continue;
				}
				
				// 새 진료카드 추가 - 입력
				System.out.print("동물의 종류, 이름, 개월 수를 작성하세요 : ");
				String animal = input.next();
				String name = input.next();
				int month = input.nextInt();
				// 새 기능 : 보호자 추가
				System.out.print("보호자의 이름을 작성하세요 : ");
				String personName = input.next();
				
				// AnimalCard를 AnimalCardNew로 수정
				// 인수에 personName 추가
				cards[AnimalCardNew.getCardCount()] 
						= new AnimalCardNew(animal, name, month, personName);
				
				System.out.println("작성이 완료되었습니다.");
			}
			else if (option == 0) {
				System.out.println("진료카드를 종료합니다.");
				break;
			}
		}
		
	}

}
