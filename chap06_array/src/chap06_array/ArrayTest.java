package chap06_array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 : 같은 타입의 변수들의 모임
		// 배열 확인
		int[] numbers; // 배열의 참조변수 선언
		numbers = new int[6]; // 배열의 객체 생성
		
		int[] numbers2 = new int[6]; // 배열의 생성
		numbers2[0] = 5; // 인덱스를 이용한 배열의 초기화
		numbers2[1] = 10;
		numbers2[2] = 15;
		
		// {} 중괄호를 통해서 바로 값을 입력 가능하다.(초기화)
		// scores[0] = 10; scores[1] = 20; scores[2] = 40; scores[3] = 70;
		int[] scores = {10, 20, 40, 70};

		
		
		// [] 대괄호를 이용하여 배열의 값 접근
		// [] : 인덱스 (0~) : 정수값(변수)
		numbers[0] = 10; 
		System.out.println(numbers[0]); // 10 출력
		System.out.println(numbers[1]); // 0 출력 : number[1]의 값을 초기화 안해서
		
		System.out.println(scores[1]); // 20 출력
		// System.out.println(scores[5]); // 존재하지 않는 인덱스에 접근했다는 에러가 뜸
		
		int index = 0;
		System.out.println(scores[index]); // 10 출력 (scores[0]과 같다.)
		System.out.println(scores[index+1]); // 20 출력 (scores[1]과 같다.)
		
		
		// 인덱스[]가 없다면 주소 값이 출력된다.
		System.out.println(scores); // [I@626b2d4a : 주소값 출력
		System.out.println(numbers); // [I@5e91993f : 배열을 생성할 때 마다 주소가 다름
		
		int[] numbers3 = numbers2; // 배열의 주소 전달
		System.out.println(numbers2); // [I@1c4af82c 
		System.out.println(numbers3); // [I@1c4af82c : 배열의 주소를 전달해서 주소가 같음
		
		numbers2[0] = 5;
		System.out.println(numbers2[0]); // 3과 2의 주소값이 같아져서 2의 값만 
		System.out.println(numbers3[0]); // 바꿔도 3이 같이 바뀐다.
		
		
		
		System.out.println(); // 출력 확인을 용이하게 하기 위한 개인적 입력
		
		
		
		// for문을 이용한 배열 요소 출력
		// 배열의 길이를 직접 입력해줄 수 있지만 length를 사용해서 쓸 수 있다.
		for (int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		
		
		System.out.println(); // 출력 확인을 용이하게 하기 위한 개인적 입력
		
		
		
		// for - each 루프
		// 배열 안에 있는 요소를 score에 담아서 사용할 수 있다.
		// 배열 안에 있는 값을 가져오는 것이기 때문에 배열의 값을 수정할 수 없다.
		for (int score : scores) {
			System.out.println(score);
		}
		
		
		System.out.println(); // 출력 확인을 용이하게 하기 위한 개인적 입력
		
		
		// 2차원 배열
		// 2차원 배열의 선언과 생성
		int[][] numArray = new int[3][5];
		numArray[0][0] = 100; // 값 변경
		
		// 내용 확인을 위해 중첩 반복문 사용
		for (int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(numArray[i][j]+" ");
			}
			System.out.println();
		}

		
		System.out.println(); // 출력 확인을 용이하게 하기 위한 개인적 입력
		
		
		// 위와 같은데 인데스 안의 값 증가가 추가됨.
		int count = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				// 인덱스 안의 값을 1씩 증가하기 위함. 없으면 0으로만 출력됨
				numArray[i][j] = count;
				count++;
				System.out.print(numArray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
		
		
		System.out.println(); // 출력 확인을 용이하게 하기 위한 개인적 입력
		
		
		// 2차원 배열의 초기화
		int[][] tableArray
		= { {10,20,30},{40,50,60,65},{70,80,90} };
		
		// .length : 가장 바깥쪽 괄호 안 {10~30},{40~60},{70~90}을 쉼표로 구분
		for (int i=0; i<tableArray.length; i++) {
			// [i].length : 안쪽 괄호의 10,20,30을 쉼표로 구분
			for (int j=0; j<tableArray[i].length; j++) {
				System.out.print(tableArray[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println(); // 출력 확인을 용이하게 하기 위한 개인적 입력
		
		
		// 다차원 배열
		// 선택 정렬 코드
		int[] numberSort = {5,2,6,1};
		int temp, least;  // least 최소값
		
		for (int i=0; i<numberSort.length-1; i++) {
			least = i; 
			for (int j=i+1; j<numberSort.length; j++) {
				// 값들을 하나씩 비교하면서 최소값 확인
				if (numberSort[j]<numberSort[least]) {
					least = j; // 현재 값(j)이 더 작다면 인덱스값을 넣어줌
				}
			}
			// 반복문이 끝난 후에 가장 작은 값의 위치를 바꿔줌
			temp = numberSort[i]; // 첫번째의 값을 저장
			// 첫번째 자리에 가장 작은 값 할당
			numberSort[i] = numberSort[least];
			numberSort[least] = temp;
		}
		
		
		
	}

}
