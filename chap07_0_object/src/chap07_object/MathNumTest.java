package chap07_object;

public class MathNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연습 내용 확인 : 정적 메소드
		System.out.println(MathNum.intAdd(10, 4));  // 14
		System.out.println(MathNum.intMax(10, 4));  // 10
		
		
		// 2. (4123/134, 6234/231)와 (673/3, 424/2)에서 
		// 각각의 큰 값을 더하라.
		int maxA = MathNum.intMax(4123/134, 6234/231);
		int maxB = MathNum.intMax(673/3, 424/2);
		int sum = maxA + maxB;
		System.out.println(sum);

	}

}
