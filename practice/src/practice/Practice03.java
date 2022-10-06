package practice;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 연습
		
		// 1. 배열의 선언, new를 이용한 생성
		// int 자료형의 길이가 10인 배열을 선언, 생성하기
		int[] num;  // 선언
		num = new int[10];  // 생성
		int[] num1 = new int[10];  // 선언과 동시에 생성
		num1[0] = 0;
		
		
		// 2. 배열의 초기화
		// 문자 '가, 나, 다, 라, 마, 바'를 갖는 문자형 배열을 초기화
		char[] words = {'가','나','다','라','마','바'};
		
		
		// 4. 배열 자료형의 특징 - 주소
		// 배열 변수와 배열의 요소의 값은 다름
		// 임의로 배열을 만들어 int[] numbers와 numbers[0]의 값 확인하기
		int[] numbers2 = new int[3];
		System.out.println(numbers2); // [I@626b2d4a 출력(주소)
		System.out.println(numbers2[0]); // 값을 초기화 하기 전이라 0 출력
		
		
		
	
		
		// 배열 초기화, 배열의 요소 값 수정 
		// 1. int 점수 배열 변수에 값을 넣어서 초기화 
		// 점수 10개 : 88, 58, 47, 69, 50, 72, 87, 90, 84, 95 
		int[] scores = {88, 58, 47, 69, 50, 72, 87, 90, 84, 95};
		
		// 2. String 이름 배열 변수에 값을 넣어서 초기화 
		// 이름 10개 : 홍길동, 흥부, 놀부, 콩쥐, 팥쥐, 장화, 홍련, 심청, 춘향, 이순신
		String[] names = {"홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화",
				"홍련", "심청", "춘향", "이순신"};
		
		// 3. boolean 합격여부 배열 변수에 값을 넣어서 초기화 
		// 합격여부 10개 : false, true, true, false, true, false, 
		// false, false, false, false 
		boolean[] pass = {false, true, true, false, true, false,
				false, false, false, false};
		
		
		
		
		// 배열의 요소값 수정
		// 1. 점수 인덱스 [0]의 값을 91로 수정
		scores[0] = 91;
		
		// 2. 이름 인덱스 [9]의 값을 몽룡으로 수정
		names[9] = "몽룡";
		
		// 3. 합격여부 인덱스 [1]의 값을 false로 수정
		pass[1] = false;
		
		
		
		
		// 배열과 for-each문
		// 1. 점수 배열 출력할 때, 뒤에 00점 이라고 출력되게 한다.
		for (int score : scores) {
			System.out.println(score+"점");
		}
		
		// 2. 이름 배열 출력할 때, 뒤에 00님 이라고 출력되게 한다.
		for (String name : names) {
			System.out.println(name+"님");
		}
		
		
		
		
		// 배열과 for문 - i를 이용한 인덱스
		// 1. 점수 배열의 점수 값을 5씩 더하세요.
		for (int i=0; i<scores.length; i++) {
			scores[i] += 5;
			System.out.println(scores[i]);
		}
		
		// 2. 이름 배열의 전체를 출력하세요.
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		// 3. 합격여부 배열의 주어진 값을 전부 반대로 바꿔서 넣기
		for (int i=0; i<pass.length; i++) {
			// 연산자 규칙을 통해서
			// = 대입 연산자는 오른쪽의 식부터 실행 후, 그 결과를 왼쪽 pass[i]를 할당한다.
			// 오른쪽 식에서 계산할 때는 그 값(pass[i])를 가져와서 계산한다.
			pass[i] = !pass[i];  // pass[i] = !false --> true
			System.out.println(pass[i]);
		}
		
		
		
		
		// 배열과 반복문과 조건문
		// 1. 점수 배열의 60 이상인 점수만 더해서 평균을 구하기
		int sumPass = 0;
		double avrgPass = 0;
		int countPass = 0;
		
		for (int score : scores) {
			if (score>=60) {
				sumPass += score;
				countPass++;
			}
		}
		
		avrgPass = sumPass/countPass;
		System.out.println("합격자 수 : "+countPass);
		System.out.println("합격자 평균 : "+avrgPass);
		
		// 2. 이름 배열에 '콩쥐'가 있는지 확인하고 출력하기
		for (String name : names) {
			if (name.equals("콩쥐")) {
				System.out.println("\"콩쥐\" 이름이 있습니다.");
			}
		}
		
		// 3. 합격여부 배열의 true인 개수 출력하기 (true 8개)
		int count = 0;
		for (boolean isCheck : pass) {
			if (isCheck) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
