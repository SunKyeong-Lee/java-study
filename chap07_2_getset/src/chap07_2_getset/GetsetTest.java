package chap07_2_getset;

public class GetsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 접근자와 설정자 내용 확인 AnimalCard
		// AnimalCard 클래스에서 생성자를 작성하지 않았을 때
		AnimalCard card1 = new AnimalCard();
		card1.setAnimal("강아지");
		System.out.println(card1.getAnimal());  // 강아지
		System.out.println(card1.getName());	// null
		System.out.println(card1.getMonth());   // 0
		
		
		// AnimalCard 클래스에서 생성자를 작성하고 나서 내용 확인
		AnimalCard card2 = new AnimalCard("고양이", "디디", 19);
		System.out.println(card2.getAnimal());  // 고양이
		System.out.println(card2.getName());	// 디디
		System.out.println(card2.getMonth());   // 19
		
		// 메소드를 이용한 메소드 작성 내용 확인
		// 메소드 작성 내용 : 동물 종류와 이름과 개월 수를 출력
		card1.printAnimalCard();
		card2.printAnimalCard();

	}

}
