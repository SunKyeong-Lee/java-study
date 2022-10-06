package chap10_exception;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 예외 처리
		// 프로그램은 예외가 발생했을 때 그 코드에서 멈춘다.
		// 코드가 멈추는 것을 막기위해 사용하는 것이 예외 처리
		// try/catch 구문을 사용하여 예외를 처리한다.
		int x = 6;
		int y = 0;
		// try 문구 안에 있는 변수는 값이 할당되지 않을 수도 있기때문에 미리 초기화
		int result = 0;
		
		try {
			// 오류/예외가 일어날 가능성이 있는 코드
			result = x/y;
		} catch(Exception e) {  // Exception 클래스의 매개변수를 통해서 오류 받아옴
			System.out.println("오류 발생");
			System.out.println(e);  // 어떤 오류인지 콘솔에서 확인 가능
		}
		// try/catch를 통해 예외 처리하면 이후 코드도 실행할 수 있다.
		System.out.println("결과 : "+result);
		
		
		// if문으로 예외처리 하기
		if (y==0) {
			System.out.println("오류 발생");
		} else {
			result = x/y;
		}
		
		// 연습, 배열의 인덱스 오류 처리
		int[] arrayNum = {1,2,3,4};
		int index = 10;
		
		try {
			System.out.println(arrayNum[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스입니다.");
			System.out.println(e); // 어떤 오류인지 확인
		} catch(Exception e) {
		System.out.println("오류 발생");
		System.out.println(e); // 어떤 오류인지 확인
		} 
		
		
		
		// 개인 메모
		// 지금껏 작성한대로 코드를 작성하다 보면 input, num에 노란 밑줄이 생기는데
		// 커서를 올려 뜨는 팝업창에서 Surround with try-with-resources를
		// 클릭하면 try/catch가 자동으로 생성되며 내가 작성한 문장이 들어간다.
		
		// 노란 밑줄 : 예외가 생길 가능성이 있어 try/catch 사용을 권장하기 위한 표시
		// 꼭 try/catch를 사용하지 않아도 괜찮다. (지금껏 그리 써왔음)
		
		// num의 자료형은 정수이므로 실수가 들어오면 오류가 발생한다.
		// ex) 3.5를 입력하면 catch의 블록에 있는 코드가 실행된다.
		//	   출력 결과 : 잘못 입력하였습니다. 오류 내용 
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("숫자를 입력해주세요 : ");
			int num = input.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("잘못 입력하였습니다.");
			System.out.println(e);
		}
		
		
		
		// 직접만든 클래스(MethodThrow)의 예외 처리
		MethodThrow div = new MethodThrow(4, 0);
		try {
			// 객체의 메소드에 throw를 통해서 요청하게되면
			// 메소드를 사용할 때 강제로 try.catch를 사용해야한다.
			System.out.println(div.division());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("오류났습니다.");
		}
		
		// 연습 내용 확인
		try {
			System.out.println(div.numArray(10));
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("오류가 났습니다.");
		}
		
		
		
		// Main에서 throw로 사용자 예외 객체 확인하기
		try {
			if(true) {
				throw new MyException();
			}
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		// 개인 메모 
		// 위와 지금거의 결과는 같다.
		// 다만 예외 메소드를 작성해 호출이냐, 메인에서 바로 작성한 것이냐에 따라
		// 오류 결과의 출력 갯수가 다르다.
		try {
			div.myMethod();
		} catch (MyException e) {
			// 오버라이딩한 toString 확인
			System.out.println(e);
			e.printStackTrace();
		}
		
		// 연습, 예외객체를 생성하는 클래스인 GreenException
		// Exception을 상속하고
		// toString을 오버라이딩해서 "그린에서 만든 예외입니다."를 return
		// 아래에서 try.catch throw를 사용해서 확인
		try {
			if(true) {
				throw new GreenException();
			}
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
