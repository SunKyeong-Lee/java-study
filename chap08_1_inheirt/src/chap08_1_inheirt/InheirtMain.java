package chap08_1_inheirt;

public class InheirtMain {

	public static void main(String[] args) {
		
		// 객체를 생성했을 때, 내용확인 가능
		SportsCar car1 = new SportsCar();
		// 상속받은 Car의 필드값을 사용할 수 있다.
		System.out.println(car1.speed);
		System.out.println(car1.speedUp(10));
		car1.setTurbo(false);
		
		// protected 접근지정자를 사용한 경우 접근이 가능하다.
		Car car2 = new Car();
		System.out.println(car2.color);
		System.out.println(car1.color); 
		
		// 내용확인 : 메소드 오버라이딩
		System.out.println(car1.speedUp(10));
		// speedDown(5)를 작성해서 값이 10에서 5로 출력됨
		
		// 내용확인 : 서브클래스의 생성자 호출(묵시적, 명시적)
		SportsCar car3 = new SportsCar();
		SportsCar car4 = new SportsCar(10, 5, "blue", true);
		
		
		
		// 연습 내용확인 : People 클래스
		People p1 = new People();
		p1.selfIntro();   // 홍길동 입니다.
		
		// 연습 내용확인 : Worker 클래스
		// 서브 클래스는 생성자를 실행할 때, 슈퍼 클래스의 생성자를 가져와서 실행한다.
		Worker w1 = new Worker();
		System.out.println(w1.nextMonth());   // 1
		w1.selfIntro();   // 홍길동 입니다.
		w1.setPeople("흥부", "남자", 30);
		w1.selfIntro();   // 흥부 입니다.
		
		// 연습 내용확인 : 슈퍼클래스의 메소드를 사용하는 메소드
		w1.intro();
		// 연습 내용확인 : 메소드 오버라이딩
		w1.selfIntro();
		
		// 연습 내용확인 : 서브클래스의 생성자 호출(묵시적, 명시적)
		Worker w2 = new Worker();
		Worker w3 = new Worker("놀부", "남", 40, "양반", 40);
		w2.selfIntro();
		w3.selfIntro();
		
		
		
		// 오브젝트 클래스
		System.out.println(car1.getClass().getName());
		
		Worker w4 = new Worker();
		System.out.println(w3.equals(w2));
		System.out.println(w3.equals(w3));
		System.out.println(w3.equals(w4));
		
		// Object라는 클래스는 모든 클래스의 슈퍼클래스
		// 모든 종류의 클래스가 들어갈 수 있다.
		// 아래와 같이 Object 객체를 매개변수로 사용하는 경우
		// 인수는 어떠한 값도 들어갈 수 있다.
		System.out.println(w2.equals(car3));
		
		// car2.toString()결과와 car2의 결과 동일
		// 동일한 메소드 사용
		// 오버라이딩하여 출력값을 바꿀 수 있다.
		System.out.println(car2.toString());
		System.out.println(car2);
		
	}

}
