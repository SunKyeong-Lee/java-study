package chap07_object;

public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 : 세상에 있는 객체(오브젝트)를 참고하여 만듬.
		// 		 ex) 자동차, 상자...
		
		// 자바는 객체지향 언어이다. - 캡슐화
		// 캡슐화의 특징 : 값과 메소드가 함께 들어가 있다.
		// 			   쉽게 바꿀 수 있다.
		
		// 객체를 만들기 위해서 class를 사용
		// class는 객체를 만드는 틀(설계도)
		// 객체는 class를 통해 생성된 것
		
		// 객체의 생성
		Box myBox;
		myBox = new Box();
		
		// 직접 만든 클래스의 객체 Box에 접근하기
		// 참조형 변수로 사용, 변수 이름으로 접근 - 주소값 출력 (객체는 참조형)
		System.out.println(myBox);
		// 객체에 접근하는 방법 - 필드의 값에 접근해서 출력
		System.out.println(myBox.height);
		// 객체에 접근하는 방법 - 메소드의 계산 결과를 출력
		System.out.println(myBox.calVolume());
		
		// 미리 작성된 클래스
		// 객체 name은 .(도트)를 통해 메소드를 사용할 수 있다.
		String name = new String("홍길동");
		System.out.println(name.equals("홍길동"));
		
		
		
		// 생성자 - new와 생성자를 통해서 객체 생성
		// 매개 변수가 없는 생성자
		System.out.println(myBox.height); // 10
		System.out.println(myBox.calVolume()); // 1000
		
		// 매개 변수가 있는 생성자
		// Box(50, 50, 50) : 50의 값을 인수라고 부른다.
		Box myBox2 = new Box(50, 50, 50);
		System.out.println(myBox2.height); // 50
		System.out.println(myBox2.calVolume()); // 125000
		
		
		
		// 메소드
		// 내용 확인 : return 
		int a = myBox.calVolume2();
		System.out.println(myBox.calVolume2());  // 1000
		
		// 내용확인 : 메소드를 이용해서 필드의 값을 바꿀 수 있다.
		myBox.setWidth(50); // 아래 출력으로 width값이 50으로 바꼈음을 확인
		myBox.printData();  // 현재 가로,세로,높이 길이 : 501010
		
		
		
		// 값에 의한 전달 (메소드에 매개 변수로 전달)
		// 기초형
		Box myBox3 = new Box();
		int x = 5;
		// 변수 x를 넣어 값이 복사되어 들어가는지 확인
		System.out.println(myBox3.plus(x));  // 6
		// 아래 x값이 바뀌지 않았으면 값이 복사되어 들어간 것
		System.out.println(x);  // 5
		
		// 기초형의 값을 넣고 수정해서 사용하고 싶은 경우
		int y = 10;
		// 메소드의 return 값을 동일한 변수가 받아와서 저장한다.
		y = myBox3.plus(y);
		System.out.println(y);  // 11
		
		
		// 참조형 - 주소값이 복사되어 들어감 > 객체에 바로 접근해서 수정
		Box myBox4 = new Box(50,50,50);
		// 가로세로높이가 전부 50일 때 결과 값
		System.out.println(myBox4.calVolume()); // 125000
		
		myBox3.cloneBox(myBox4); // 메소드에서 수정된 높이 : 10
		// 주소값으로 접근했기 때문에, 값이 수정되어 출력
		System.out.println(myBox4.calVolume()); // 1000
		
		
		// 실습 내용 확인 : 참조형 메소드
		Box myBox5 = new Box(30,30,30);
		
		// myBox3.cloneBox(myBox4)로 인해 
		// myBox4의 가로세로높이가 50에서 10으로 값이 변경됨
		// 10,10,10 = 10,10,10 : 참
		System.out.println(myBox3.equalsBox(myBox4));  // true
		// 10,10,10 = 30,30,30 : 거짓
		System.out.println(myBox3.equalsBox(myBox5));  // false
		// 10,10,10 = 30,30,30 : 거짓
		System.out.println(myBox4.equalsBox(myBox5));  // false
		
		// 직접 만든 객체를 비교하고 싶다면
		if (myBox3.equalsBox(myBox5)) {
			System.out.println("크기가 같은 박스입니다.");
		} else {
			System.out.println("크기가 다른 박스입니다.");
		}
		
		if (myBox3.equalsBox(myBox4)) {
			System.out.println("크기가 같은 박스입니다.");
		} else {
			System.out.println("크기가 다른 박스입니다.");
		}
		// 출력 결과
		// 크기가 다른 박스입니다.  // 크기가 같은 박스입니다.
		
		
		
		// 정적 변수는 각각의 객체를 통해서 호출할 수 있다.
		System.out.println(myBox3.boxCount);  // 5
		System.out.println(myBox5.boxCount);  // 5
		
		// 정적 변수는 클래스를 통해서 출력할 수 있다. 보통은 클래스로 접근
		System.out.println(Box.boxCount);  // 5
		
		Box myBox6 = new Box();
		System.out.println(Box.boxCount);  // 6 (객체를 하나 더 생성해서 값이 증가함)
		
		// 정적 변수를 이용한 상수
		// Box.MAX_BOX_LINE = 10; - final 키워드로 수정할 수 없다.
		System.out.println(Box.MAX_BOX_LINE);  // 350
		
		
		
		// 정적 메소드
		// Math의 정적 메소드 사용
		// Math는 객체를 만들지 않고 바로 접근 (클래스로 접근)
		// PI - 다른 클래스에서 만든 정적 변수(상수)
		System.out.println(Math.PI);
		
		// sqrt() - 제곱근을 구하는 메소드
		// 객체를 가지고 있지 않기에 값을 받아와서 계산
		System.out.println(Math.sqrt(16));
		
		// 정적 메소드를 이용한 출력
		System.out.println(Box.getBoxCount()); // 6

	}

}
