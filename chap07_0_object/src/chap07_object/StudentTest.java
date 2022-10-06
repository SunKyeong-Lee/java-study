package chap07_object;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. 만든 클래스의 객체 생성하기
		Student myS = new Student(); 
		System.out.println(myS.name); // 아무런 값을 넣지 않아 null 출력
		
		// 2. 필드에 직접 접근해서 값 할당 (잘 사용하지는 않는다)
		myS.name = "홍길동";
		myS.age = 26;
		myS.grade = 4;
		
		System.out.println(myS.name);
		System.out.println(myS.age);
		System.out.println(myS.grade);
		myS.printGrade(); // 만들어둔 메소드 호출
		
		// 3. 다른 객체 생성
		Student myS2 = new Student();
		System.out.println(myS2.name); // null
		
		myS2.name = "흥부";
		myS2.age = 20;
		myS2.grade = 1;
		
		System.out.println(myS2.name); // 흥부 출력
		System.out.println(myS2.age); // 20 출력
		System.out.println(myS2.grade); // 1 출력
		myS2.printGrade(); // 1 출력
		
		
		
		// 실습 내용 확인 : 생성자
		// 1. 매개 변수를 갖지 않는 생성자
		// 2. name값을 매개 변수로 받아오는 생성자
		// 3. 매개 변수 여러 개 사용한 생성자
		Student s1 = new Student();
		Student s2 = new Student("흥부");
		Student s3 = new Student("놀부",26,4);
		
		System.out.println(s1.name);           // 홍길동
		System.out.println(s2.name);		   // 흥부
		System.out.println(s3.name+s3.grade);  // 놀부4
		
		
		
		// 실습 내용 확인 : 메소드 4 ~ 6
		s1.setGrade(4);
		s1.printGrade();  // 4
		s1.printLevel();  // 고학년입니다.

		s2.printGrade();  // 0
		s2.printLevel();  // 저학년입니다.
		
		System.out.println(s3.getAge()); // 26
		
		
		
		// 실습 내용 확인 : 정젹 변수와 정적 메소드 7 ~ 8
		// 정적 변수
		System.out.println(Student.studentCount); // 5
		// 정적 메소드
		System.out.println(Student.getStudentCount()); // 5

	}

}
