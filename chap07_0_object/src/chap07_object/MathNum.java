package chap07_object;

public class MathNum {
	
	// 두 숫자 중 큰 값을 return하는 정적 메소드
	static int intMax(int a, int b) {
		if (a>b) {
			return a;
		} else {
			return b;
		}
	}
	
	// 두 숫자를 더한 값을 return하는 정적 메소드
	static int intAdd(int a, int b) {
		return a+b;
	}

}
