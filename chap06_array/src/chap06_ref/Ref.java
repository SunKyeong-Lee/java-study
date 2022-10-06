package chap06_ref;

public class Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 참조형의 저장 값 확인하기
		// String으로 확인하기
		String name1 = "사과";
		String name2 = "사과";
		String name3 = "apple";
		System.out.println(name1 == name2); // true (사과 = 사과 : 참)
		System.out.println(name1 == name3); // false (사과 = apple : 거짓)
		
		
		System.out.println(); // 출력 확인을 용이하게 하기 위한 입력

		
		String name4 = new String("사과");
		String name5 = new String("사과");
		// == 연산자로 String을 비교할 때 주소값으로 비교한다. 
		// name4와 name5는 서로 다른 주소에 저장되어 있기 때문에 false가 나온다.
		System.out.println(name4 == name5); // false (주소값 비교)
		// 참조형을 비교할 때는 메소드(.equals)를 사용해서 비교
		System.out.println(name4.equals(name5)); // true (사과 = 사과 : 참)
		
		
	}

}
