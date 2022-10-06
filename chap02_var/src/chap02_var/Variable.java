package chap02_var;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a; a=0;
		// 변수 a는 int 자료형 변수이다.
		// a라는 변수에는 int 자료형 값(예:1, 10, 25 등의 정수)만 담을 수 있다.
		
		int speed; // 변수 선언
		int 반복횟수, loop; // 같은 타입의 변수를 동시 선언
		
		// 선언을 한 경우 변수 이름에다가 값을 넣음 (값을 할당한다. 초기화)
		// 선언만 된 변수는 반드시 초기화한 후에 사용
		speed = 10;
		반복횟수 = 2;
		loop = 20;
		
		int interertRate = 1; // 변수 선언과 동시에 초기화
		int idex = 1, total = 2; // 같은 타입의 변수를 동시에 선언하면서 초기화
		
		// 변수는 값을 할당할 때 마지막에 할당된 값이 들어간다.
		// 처음에는 값이 0이었지만 10의 값을 넣어주었기 때문에 num의 값은 10이 된다.
		int num = 0;
		num = 10;
		System.out.println(num); // 변수를 출력하기 위해서는 변수 이름만 작성한다.
		
		
		
		
		// 자바의 정수를 표현하기 위한 자료형 : int, long (그 외는 잘 안씀)
		// 자신이 사용하고자 하는 데이터 최대 크기를 고려해 정수형 타입을 결정한다.
		// 예) byte number = 300;  
		// 예) 할당된 값(300)이 byte 자료형의 최대 값인 127보다 크므로 오류가 발생
		int age = 10;
		
		// long 변수에 값을 넣어줄 때 int의 범위를 지난 값은 L을 붙여준다.
		// 큰 숫자에 L과 같은 접미사를 누락하면 컴파일 에러가 발생한다.
		long countOfStar = 8764827384923849L; 
		
		// 정수형 상수
		int var = 30;         // 30이 바로 리터럴이다.
		final int AGES = 100; // 100이 바로 리터럴이다.
		
		
		
		
		// 자바에서 실수형은 디폴트가 double
		// float 변수에 값을 넣어줄 때 F 접미사를 붙여 준다.
		float pi = 3.14F;
		double morePi = 3.14159265358979323846;
		
		
		
		
		// 기호 상수 final
		// final PI의 값을 할당하고, 다시 PI의 값을 할당할 경우 에러가 뜬다.
		// 즉, 값을 수정하여 할당할 수 없다.
		final double PI = 3.141592; // 초기화 값을 바꾸어서 원하는 값을 넣을 수 있다.
		
		
		
		
		// 논리형 boolean - 참, 거짓 두가지 값만 가지는 자료형
		boolean isRain = false; // 0과 같은 정수값은 넣을 수 없다.
		System.out.println(isRain); // false로 출력되지만 boolean값이다.
		
		// int num1 = 10;
		// boolean check;를 만들어서 num1>20 값을 check에 넣고 check를 출력하여 확인하자
		// num1의 값을 30으로 바꾸어서 check를 출력하여 확인하자
		int num1 = 10;
		boolean check;
		check = (num1>20); // 10>20 : 거짓
		System.out.println(check);
		
		num1 = 30;
		check = (num1>20); // 30>20 : 참
		System.out.println(check);
		
		
		
		
		// 문자형과 문자열
		// 문자형은 유니코드로 된 한 글자를 표시할 수 있다.
		// 문자 값을 작은 따옴표(')로 감싸줘야 한다.
		char ch1 = '가';
		char ch2 = '\uac00'; // 역슬래쉬(\) : Enter키 위에 있음
		System.out.println(ch1);
		System.out.println(ch2); // 유니코드, '가'를 나타낸다.
		
		// 문자열은 String 클래스를 이용해서 값을 할당할 수 있다.
		// 문자 값을 큰 따옴표(")로 감싸줘야 한다. : 따옴표 안에 있는 모든 글은 문자열 취급
		String s = "Hello, World!";
		System.out.println(s);
		
		// 문자열의 특수문자
		String word = "\" : 쌍따옴표시 \' : 따옴표시 \n새 라인";
		System.out.println(word);
		
		System.out.println(" \\ : 역슬래시를 출력합니다. ");
		System.out.println(" \' : 작은 따옴표를 출력합니다. ");
		System.out.println(" \" : 큰 따옴표를 출력합니다. ");
		System.out.println(" ( : 괄호를 출력합니다. ");
		System.out.println(" / : 슬래시를 출력합니다. ");
		
		System.out.println("aaa\0bbb\rc"); // 출력 결과 caa bbb
		
		
		
		
		// 형변환
		// 축소 변환 : double > int 데이터의 일부를 잃을 수 있다.(소수점 이하 사라짐)
		int i = (int)10.5; // i에는 10만 저장
		System.out.println(i); // 10 출력
		
		// 확대 변환 : int > double
		double d = (double)10;
		System.out.println(d); // 10.0 출력
		
		// 328/5의 결과 확인
		// int/int = int형으로 출력
		System.out.println(328/5); // 65
		
		// double/int = double형으로 출력(더 큰쪽으로 맞춤)
		System.out.println((double)328/5); // 65.6
		
		// double/double = double형으로 출력
		System.out.println((double)328/(double)5); // 65.6
		
		// 하나라도 실수형이면 실수형으로 출력된다.
		System.out.println(328.0/5); // 65.6
		
		// 강제로 형변환을 했기 때문에 결과가 int형으로 나옴
		System.out.println((int)32.8/5); // 6

	}

}
