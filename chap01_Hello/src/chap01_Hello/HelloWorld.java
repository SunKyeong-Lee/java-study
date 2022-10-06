package chap01_Hello;

// 자바는 클래스 단위로 .java 파일을 생성한다.
public class HelloWorld {

	/**
	 * 표준 출력으로 "Hello, World!"를 표시하는 간단한 자바 애플리케이션의 구현이다.
	 */
	public static void main(String[] args) {
		
		// 여기서 println은 메소드(명령을 실행하는 묶음)이다.
		// Println을 이용하면 안의 문자열을 출력한다.
		// 문자열을 입력할 때 ""(쌍따옴표)를 써야한다.
		System.out.println("Hello, World!");  // 문자열 출력
		/*
		 주석을 여러줄 사용할 때 쓴다.
		 ctrl + space를 누르면 도움상자가 나온다.
		 Sysout을 입력 후 ctrl + Space를 누르면 자동완성이 된다.
		 */
		
		// 코드는 위에서 아래로 순차적으로 실행
		System.out.println("Java");
		System.out.println("Welcome to");
		
		
		
		
		// 실습1. 주석으로 표기하여 프로그램 작성
		// 자신의 이름과 생일을 출력하고 주석으로 //이름과 생일이라고 표기
		System.out.println("이선경, 03.17"); // 이름과 생일
		
		// 실습2. 코드의 순서
		// Java, (다음 줄)Welcome to로 출력하기 위해 아래 코드를 수정
		System.out.println("Welcome to");
		System.out.println("Java");
		// 수정
		System.out.println("Java");
		System.out.println("Welcome to");
		
	}
	
}


