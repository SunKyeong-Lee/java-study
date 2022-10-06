package chap10_exception;

//숫자 2개를 받아와서 나누는 클래스
public class MethodThrow {
	
	// 필드
	private int x;
	private int y;
	
	// 상수
	private final int[] NUMBER = {1, 2, 3, 4};
	
	// 생성자
	public MethodThrow() {
		this.x = 1;
		this.y = 1;
	}
	
	public MethodThrow(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 상위 메소드(객체를 통해 메소드를 사용할 때, try/catch 사용)에게
	// 예외처리를 요청하는 throw
	public int division() throws Exception {
		return x/y;
	}
	
	// 연습, 아래의 상수가 있을 때
	// private final int[] NUMBER = {1,2,3,4};
	// 숫자값을 입력받아와서 상수의 인덱스에 접근해서 값을 return하는 메소드
	public int numArray(int num) throws Exception {
		return NUMBER[num];
	}
	
	// 사용자 정의 예외 객체 사용
	// 에러가 발생하기 때문에 메소드에 throws를 통해서 알려준다.
	public void myMethod() throws MyException {
		// 실행할 때마다 항상 MyException 에러를 만드는 메소드
		if (true) {
			throw new MyException();
		}
	}
	
}
