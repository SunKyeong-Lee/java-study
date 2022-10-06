package chap08_1_inheirtAnimal;

// chap07_2_getset에 있던 클래스 복사해옴
public class AnimalCard {
	
	// 필드
	private String animal;
	private String name;
	private int month;
	
	private static int cardcount = 0;
	public static final int MAX_CARD = 100;
	
	// 정적 메소드 getCardCount
	public static int getCardCount() {
		return cardcount;
	}
	
	// 생성자
	public AnimalCard() {
		this.animal = "";
		this.name = "";
		this.month = 0;
		
		cardcount++;
	}

	// 매개변수가 있는 생성자
	public AnimalCard(String animal, String name, int month) {
		this.animal = animal;
		this.name = name;
		this.month = month;
		
		cardcount++;
	}
	
	// 접근자
	public String getAnimal() {
		return animal;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMonth() {
		return month;
	}
	
	// 설정자
	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	// 동물 종류와 이름과 개월 수를 출력하는 메소드
	public void printAnimalCard() {
		String animal = getAnimal();
		String name = getName();
		int month = getMonth();
		
		System.out.println("동물 종류 : "+animal+", 이름 : "
							+name+", 개월 : "+month);
	}
	
}
