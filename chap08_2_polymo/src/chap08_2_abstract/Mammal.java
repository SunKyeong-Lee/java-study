package chap08_2_abstract;

// Animal 추상 클래스를 상속 받는 Mammal 추상 클래스
public abstract class Mammal extends Animal {
	
	// Animal 추상 클래스의 추상 메소드 오버라이딩
	@Override
	public void move() {
		System.out.println("이동한다.");
	}
	
	public abstract void sound();
	
}
