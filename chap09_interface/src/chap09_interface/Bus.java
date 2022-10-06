package chap09_interface;

public class Bus implements CarOptionInterface {
	
	// 인터페이스의 추상메소드를 추가하고 싶을 때는
	// 상속을 통해서 새로운 인터페이스에 추가하는 것이 안전하다.
	
	// CarInterface에 있는 추상 메소드
	@Override
	public void printCar() {
		System.out.println("CarOptionInterface를"
				+ " Bus에서 구현했습니다.");
	}

	// CarOptionInterface에서 작성한 추상메소드
	@Override
	public void carDrive() {
		
	}
	
}
