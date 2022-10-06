package chap08_2_abstract;

// 추상 클래스를 상속 받는 자식 클래스
public class Rectangle extends Shape {
	
	// 추상 클래스의 추상 메소드 구현
	@Override
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}

	@Override
	public void print(String word) {
		System.out.println("사각형 클래스에서 출력 : "+word);
	}

}
