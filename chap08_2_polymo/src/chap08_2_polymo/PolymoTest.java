package chap08_2_polymo;

public class PolymoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 타입 변환 : 다른 데이터 타입으로 변환하는 행위
		// 클래스의 경우 : 자식 타입은 부모 타입으로 자동 변환이 가능하다.
		// Car : SportsCar의 부모클래스
		// SportsCar : Car의 자식클래스
		// 변수의 데이터 타입은 부모 클래스이지만, 안에 객체는 자식 클래스
		Car myCar = new SportsCar();
		// 부모클래스로 자동으로 타입변환을 해줄경우 부모 필드/메소드는 사용가능
		// 부모클래스로 타입변환이 되었기때문에 SportsCar의 필드/메소드는 사용불가능
		System.out.println(myCar.color);
		// 부모 클래스의 메소드를 오버라이딩한 내용은
		// SportsCar에서 수정한 내용으로 사용이 가능하다.
		System.out.println(myCar.speedUp(10));
		
		// 자동 형변환의 예시
		// String + int = String 자동 형변환
		System.out.println("글자와 숫자의 결합"+10);
		// double / int = double 자동 형변환
		System.out.println(10.2/2);
		
		// 강제로 형변환 - 앞에 괄호를 통해 자료형을 바꿔줌
		Car yourCar = (Car)new SportsCar();
		System.out.println(10.2/(double)2);
		
		// 자식클래스에 부모클래스 객체를 할당할 수 없다.
		// SportsCar sportsCar = new Car();
		
		// 부모 자료형의 변수에 넣은 자식 객체를 강제로 형변환해서 넣기
		// 자식객체를 그대로 사용한다(변수 그대로 할당하였으므로 주소 복사)
		SportsCar sportsCar1 = (SportsCar) myCar;
		// 자식객체의 메소드/필드를 사용할 수 있다.
		// 주소를 그대로 가져왔기에, 값이 동일하게 바뀐다.
		sportsCar1.setTurbo(true);
		
		// 자식 자료형 변수에 부모 객체를 강제로 형변환해서 넣을 수 없다.
		// 콘솔창에서 에러 확인 가능
		// SportsCar sportsCar2 = (SportsCar) new Car();
		
		// 결론? 상속에서의 다형성
		// Car라는 부모 클래스 안에 여러가지 자식 클래스가 들어갈 수 있다.
		
		
		
		
		// 실습 내용 확인 : People
		// 상속의 다형성과 타입 변환 확인
		// 자동 타입 변환(형변환)
		People p1 = new Worker("흥부", "남", 30, "농부", 40);
		// 오버라이딩을 통해서 메소드를 들고올 때 입력해준 필드값들 존재 확인
		p1.selfIntro();
		
		// 강제 타입 변환과 타입 확인
		// instanceof 변수 안의 객체의 타입(클래스)를 알 수 있다.
		System.out.println(p1 instanceof Worker);
		Worker worker = (Worker) p1;
		worker.intro();
		worker.nextMonth();
		worker.nextMonth();
		System.out.println(worker.nextMonth());
		
	}

}
