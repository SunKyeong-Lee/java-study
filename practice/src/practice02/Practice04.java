package practice02;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 연습
		// 배열 선언
		// String names 선언하세요.
		String[] names;
		
		// 배열의 초기화
		// "흥부","놀부"로 초기화 하세요.
		names = new String[]{"흥부", "놀부"};
		
		
		
		
		// 클래스와 객체 연습 내용 확인
		// 클래스의 객체 생성
		Book myBook = new Book();
		Book myBook1 = new Book("흥부전", 100);
		
		// 메소드를 만들지 않아 필드값에 직접 접근하지만, 보통은 메소드로 접근함
		System.out.println(myBook.title);   // 제목 미정 
		System.out.println(myBook1.title);  // 흥부전
		
		System.out.println(myBook.getTitle());   // 제목 미정 
		System.out.println(myBook1.getTitle());  // 흥부전
		myBook.setTitle("심청전");
		System.out.println(myBook.getTitle());   // 심청전
		
		System.out.println(myBook.checkPageCount());  // false
		System.out.println(myBook1.checkPageCount()); // true
		
		if (myBook.checkPageCount()) {
			System.out.println("페이지가 들어가 있습니다.");
		} else {
			System.out.println("페이지가 입력되어 있지 않습니다.");
		}
		// false이기 때문에 else의 명령문 실행
		// myBook1이였다면 true라 if의 명령문이 실행된다.
		
	}

}
