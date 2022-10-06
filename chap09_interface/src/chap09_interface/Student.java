package chap09_interface;

public class Student implements Comparable {
	
	// 필드
	private String name;
	private int grade;
	
	// 생성자
	public Student() {
		this.name = "홍길동";
		this.grade = 1;
	}
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Object otherObject) {
		// 비교하는 메소드
		// Student 객체를 받아와서 그 객체 안의 grade를 비교하는 메소드
		
		// 1. otherObject를 interfaceof로 객체의 타입을 확인하고
		//	  객체의 타입이 Student일 때, 그 객체를 Student 객체로 형변환한다.
		// 1-1. 객체의 타입이 Student가 아닐 때
		//		Student의 객체가 아닙니다 를 출력하고 return 10을 반환
		// 2. 형변환을 했다면 this 객체의 grade에 접근해서 
		//	  형변환한 otherObject의 grade를 비교
		// 2-1. 값이 같으면 0을, 값이 this가 크면 1을, this가 작으면 -1을
		//		각각 return 한다.
		if (otherObject instanceof Student) {
			Student student = (Student) otherObject;
			if (this.grade > student.grade) {
				return 1;
			} else if (this.grade < student.grade) {
				return -1;
			} else {
				return 0;
			}
		} else {
			System.out.println("Student의 객체가 아닙니다.");
			return 10;
		}

	}

}
