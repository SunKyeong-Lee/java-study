package chap08_2_abstract;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 추상 클래스는 객체를 생성하게 되면 생성자로 생성할 수 없다.
		// 추상 메소드의 몸체를 구현해서 사용할 수 있다.
		// 서브 클래스를 통해서 상속 받아 그 몸체를 구현하여 사용한다.
		// Shape s1 = new Shape(); - 오류
		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.print("단어를 입력합니다.");
		r1.move(10, 10);
		
		Circle c1 = new Circle();
		c1.draw();
		c1.print("원");
		
		
		
		// 연습 내용 확인 : 추상 클래스
		Dog dog = new Dog();
		dog.move();
		dog.sound();
		Cat cat = new Cat();
		cat.move();
		cat.sound();

	}

}
