package chap08_1_inheirt;

public class Car {
	// 필드
	// protected를 이용하면 상속과 접근이 가능하다.
	protected int speed;
	protected int gear;
	protected String color;
	
	// 생성자
	Car() {
		this.speed = 0;
		this.gear = 0;
		this.color = "red";
	}
	
	Car(int speed, int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
	}
	
	// 메소드
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public int speedUp(int speed) {
		this.speed += speed;
		return this.speed ;
	}
	
	public int speedDown(int speed) {
		this.speed -= speed;
		return this.speed;
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		return color+"색 차량입니다.";
	}
	
}
