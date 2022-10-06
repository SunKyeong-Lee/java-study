package chap09_interface;

// implements 키워드를 통해서 메소드 구현
// 인터페이스의 경우 대부분이 추상 메소드로 이루어져있기 때문에 실행 코드가 필요
// 인터페이스를 구현 받은 클래스에서 실행 코드 작성 
public class Truck extends Car implements CarInterface {
	
	public void setTruck(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public String getTruckColor() {
		return color;
	}
	
	public int getTruckSpeed() {
		return speed;
	}

	@Override
	public void printCar() {
		System.out.println("인터페이스의 내용을 Truck에서 구현했습니다.");
	}

}
