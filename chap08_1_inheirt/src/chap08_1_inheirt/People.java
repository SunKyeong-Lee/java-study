package chap08_1_inheirt;

public class People {
	
	// 필드
	protected String name;
	protected String gender;
	protected int age;
	
	// 메소드
	// 디폴트 생성자
	public People() {
		this.name = "홍길동";
		this.gender = "남";
		this.age = 20;
	}
	
	// 매개변수를 갖는 생성자
	People(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	// 설정자
	public void setPeople(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	// name을 출력하는 메소드
	public void selfIntro() {
		System.out.println(name+" 입니다.");
	}
	
	// Object 클래스
	// 클래스를 상속받지 않을 때 Object 클래스를 상속 받는다.
	// 필요하다면 Override를 통해 내용을 수정해서 사용할 수 있다.
	@Override
	public boolean equals(Object object) {
		// Object 객체로 받아오는 경우는 클래스를 구분해서 사용
		// .getClass().getName()을 이용하여 구분
		System.out.println("People의 내용이 출력되었습니다.");
		return true;
	}
	
	// 동일한 이름을 갖는 중복 정의가 됨
	public boolean equals(People people) {
		System.out.println("People의 equal 중복 정의입니다.");
		return true;
	}
	
}
