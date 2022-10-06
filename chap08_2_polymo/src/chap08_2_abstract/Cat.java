package chap08_2_abstract;

//Mammal 추상 클래스를 상속 받는 자식 클래스
public class Cat extends Mammal {

	// Mammal 추상 클래스의 추상 메소드 오버라이딩
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
