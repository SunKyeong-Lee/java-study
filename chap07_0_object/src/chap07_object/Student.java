package chap07_object;

public class Student {

	// 필드값
	String name;
	int age;
	int grade;
	
	// 7. 정적 변수 - 생성된 학생들의 수를 저장
	// 생성자마다 들어가 있어야 한다.
	static int studentCount;
	
	
	// 생성자
	// 1. 매개변수를 갖지 않는 생성자
	Student() {
		this.name = "홍길동";
		this.age = 0;
		this.grade = 0;
		// 7. 정적 변수
		// 객체가 생성될 때마다 1씩 증가
		studentCount++;
	}

	// 2. name값을 매개 변수로 받아오는 생성자
	Student(String name) {
		this.name = name;
		this.age = 0;
		this.grade = 0;
		// 7. 정적 변수
		// 객체가 생성될 때마다 1씩 증가
		studentCount++;
	}

	// 3. 매개 변수를 여러개 받아와서 사용할 수 있다.
	Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		// 7. 정적 변수
		// 객체가 생성될 때마다 1씩 증가
		studentCount++;
	}

	
	// 메소드
	void printGrade() {
		System.out.println(grade);
	}
	
	// 4. return을 통해 나이값을 되돌려주는 메소드
	int getAge() {
		return this.age;
	}
	
	// 5. 매개변수를 통해 학년을 수정하는 메소드
	void setGrade(int grade) {
		this.grade = grade;
	}
	
	// 6. grade에 따라서 고학년, 저학년 나눠서 출력하기
	//	  3학년 초과는 고학년, 3학년 이하는 저학년
	// 조건문(if, for, while) 사용 가능
	void printLevel() {
		if (grade>3) {
			System.out.println("고학년입니다.");
		} else {
			System.out.println("저학년입니다.");
		}
	}
	
	// 8. 정적 메소드 studentCount를 return하는 메소드
	static int getStudentCount() {
		return studentCount;
	}
	
}
