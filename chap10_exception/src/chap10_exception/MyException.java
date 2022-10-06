package chap10_exception;

//직접 예외 객체를 만들기 위해 Exception을 상속받는 클래스 생성
//말 그대로 오류 객체를 생성하기 위한 클래스
//오류의 내용을 적어둔다. (오류가 발생하는 것은 throw를 통해 알림)
public class MyException extends Exception {
	
	@Override
	public String toString() {
		return "사용자 정의 예외입니다.";
	}
	
}
