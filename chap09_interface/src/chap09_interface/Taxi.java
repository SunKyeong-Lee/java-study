package chap09_interface;

public class Taxi extends Car implements CarInterface {

	// 상속받은 필드값으로 메소드 구현
	// 슈퍼 클래스(Car)의 필드/메소드 사용 가능
	public void setTaxi(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public String getTaxiColor() {
		return color;
	}
	
	@Override
	public void printCar() {
		System.out.println("인터페이스의 내용을 Taxi에서 구현했습니다.");
	}

}
