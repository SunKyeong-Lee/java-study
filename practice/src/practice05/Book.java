package practice05;

public class Book {
	
	// 필드
	private String title;
	private String author;
	private int page;
	private boolean checkOut;
	
	// 정적 필드
	private static int bookCount = 0;
	
	// 정적 메소드
	public static int getBookCount() {
		return bookCount;
	}
	
	// 생성자
	// 디폴트 생성자
	public Book () {
		this.title = "미정";
		this.author = "미상";
		this.page = 0;
		this.checkOut = false;
		
		bookCount++;
	}

	// 매개변수를 갖는 생성자
	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
		this.checkOut = false;
		
		bookCount++;
	}
	
	// 메소드
	// checkOut값을 리턴
	public boolean getCheckOut() {
		return checkOut;
	}
	
	// 깃허브 코드 확인 : checkOut이 false일거 같은데 true로 하셔서..
	// checkOut의 값이 true일 때 
	// : 값을 false로 바꾸고, "책을 반납하였습니다." 출력
	// checkOut의 값이 false일 때 
	// : 값을 true로 바꾸고, "책을 대여하였습니다." 출력
	public void isCheckOut() {
		if (checkOut == true) {
			checkOut = false;
			System.out.println("책을 반납하였습니다.");
		} else {
			checkOut = true;
			System.out.println("책을 대여하였습니다.");
		}
	}
	
	// checkOut이 false : "author의 title책이 현재 있습니다." 출력
	// checkOut이 true : "author의 title책을 대여하였습니다." 출력
	public void printBook() {
		if (checkOut == false) {
			System.out.println(author+"의 "+title
								+" 책이 현재 있습니다.");
		} else {
			System.out.println(author+"의 "+title
								+" 책을 대여하였습니다.");
		}
	}
	
}
