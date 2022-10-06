package practice02;

public class Book {
	
	// 필드
	String title;
	int page;
	
	
	// 생성자
	// 매개변수가 없을 때
	Book() {
		this.title = "제목 미정";
		this.page = 0;
	}
	
	// 매개변수가 있을 때
	Book(String title, int page) {
		this.title = title;
		this.page = page;
	}
	
	
	// 메소드
	// 책 제목을 받아와서 값을 넣어주는 메소드
	public void setTitle(String title) {
		this.title = title;
	}

	// 책 제목을 return 해주는 메소드
	public String getTitle() {
		return title;
	}
	
	// 책 페이지가 0이면 false를 출력하는 메소드
	public boolean checkPageCount() {
		boolean check;
		if (this.page == 0) {
			check = false;
		} else {
			check = true;
		}
		return check;
	}
	
}
