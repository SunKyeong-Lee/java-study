package chap08_2_abstract;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}

	@Override
	public void print(String word) {
		System.out.println("Circle클래스에서 출력 : "+word);
	}

}
