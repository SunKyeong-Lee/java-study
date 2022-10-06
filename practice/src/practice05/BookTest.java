package practice05;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연습 내용 확인 Book
		// 아래 내용 작성 전 각 메소드 내용 확인
		Book book1 = new Book("홍길동전", "허균", 100);
		book1.isCheckOut();
		book1.printBook();
		

		
		// bookList 배열을 만들어, 그 안에 Book 객체를 넣자
		// 배열 객체만들기
		Book[] booklist = new Book[100];

		// 기능 추가 및 반복하기
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("1. 전체 책 개수 확인 "
					+ "2. 전체 책 정보 출력 "
					+ "3. 인덱스를 입력하여 책 대여/반납 "
					+ "4. 책 추가 0. 종료 : ");
			int option = input.nextInt();
			
			if (option==1) {   // 전체 책 개수 확인
				System.out.println("현재 책의 개수는 "+
								Book.getBookCount()+"개 입니다.");
			} else if (option==2) {    // 전체 책정보 출력
				for (int i=0; i<Book.getBookCount(); i++) {
					booklist[i].printBook();
				}
			} else if (option==3) {    // 인덱스를 입력하여 책 대여/반납
				System.out.print("책 대여/반납할 인덱스를 적어주세요 : ");
				int index = input.nextInt();
				if (index >= 0 && index < Book.getBookCount()) {
					booklist[index].isCheckOut();
				} else {
					System.out.println("없는 인덱스 입니다.");
				}
			} else if (option==4) {    // 책 추가
				System.out.print("책 제목과 저자, 쪽수를 작성하세요 : ");
				String title = input.next();
				String author = input.next();
				int page = input.nextInt();
				booklist[Book.getBookCount()] = new Book(title, author, page);
				System.out.println("작성이 완료되었습니다.");
			} else if (option==0) {    // 종료
				System.out.println("도서정리를 종료합니다.");
				break;
			}
			
			
			// 같은 내용 switch문으로 작성하기
			// 수업, 깃허브 코드 확인할 것
			Book[] booklist2 = new Book[100];
			int option2 = 1;
			while (option2 != 0) {
				System.out.print("1. 전체 책 개수 확인 "
										+ "2. 전체 책 정보 출력 "
										+ "3. 인덱스를 입력하여 책 대여/반납 "
										+ "4. 책 추가 0. 종료 : ");
				option2 = input.nextInt();
				
				switch (option2) {
				case 1:
					System.out.println("현재 책의 개수는 "
											+ Book.getBookCount()+"개 입니다.");
					break;
				case 2:
					for (int i=0; i<Book.getBookCount(); i++) {
						booklist2[i].printBook();
					}
					break;
				case 3:
					System.out.print("책 대여/반납할 인덱스를 적어주세요 : ");
					int index2 = input.nextInt();
					if (index2 >= 0 && index2 < Book.getBookCount()) {
						booklist2[index2].isCheckOut();
					} else {
						System.out.println("존재하지 않는 인덱스입니다.");
					}
					break;
				case 4:
					System.out.print("책 제목과 저자, 쪽수를 작성하세요 : ");
					String title2 = input.next();
					String author2 = input.next();
					int page2 = input.nextInt();
					// 배열의 인덱스에 객체 생성
					booklist2[Book.getBookCount()] 
									= new Book(title2, author2, page2);
					System.out.println("작성이 완료되었습니다.");
					break;
				case 0:
					System.out.println("도서정리를 종료합니다.");
					break;
				}
			}			
			
		}
	}

}
