package chap08_1_inheirtAnimal;

// AnimalCard클래스에 새 기능을 추가하기 위해 
// AnimalCardNew클래스를 생성하고, AnimalCard를 상속받음
public class AnimalCardNew extends AnimalCard {
	
	// 필드
	private String personName;
	
	// 생성자
	// 디폴트 생성자
	public AnimalCardNew() {
		this.personName = "";
	}
	
	// 매개변수를 갖는 생성자
	public AnimalCardNew(String animal, String name, 
							int month, String personName) {
		super(animal, name, month);
		this.personName = personName;
	}
	
	// 메소드 오버라이딩
	@Override
	public void printAnimalCard() {
		System.out.println("보호자 성함 : "+personName);
		super.printAnimalCard();
	}

}
