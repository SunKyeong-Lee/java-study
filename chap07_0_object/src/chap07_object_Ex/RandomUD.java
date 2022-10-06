package chap07_object_Ex;

import java.util.Scanner;

public class RandomUD {
	
	// 업다운 게임
	// 1. 랜덤한 수가 만들어짐
	// 2. 수를 입력 받음
	// 3. 입력받은 수를 랜덤한 수와 비교 결과를 알려줌
	// 4. 결과에 따라서 크다, 작다를 알려주고
	// 5. 같다면 게임 끝
	
	
	// 필드 - private 직접 접근해서 값을 수정하는 것을 막기 위함
	private int num;      // (정답이 될) 랜덤한 수
	private int userNum;  // 유저 입력 수
	
	
	// 메소드
	// public - 객체를 통해서 사용되는 메소드
	// private - 클래스 안에서만 사용되는 메소드
	
	// 1. 랜덤한 수를 만듦 : 랜덤한 숫자값을 num에 할당
	// 클래스 안에서만 사용할거라 private
	private void getRandomNum() {
		this.num = (int)(Math.random()*100);
		System.out.println("확인을 위한 출력입니다. 정답 : "+num);
	}
	
	
	// 2. 유저 값을 입력받고 내보내기
	private int checkUserGuess() {
		System.out.print("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		this.userNum = input.nextInt();  // 입력받은 값을 userNum에 반환
		return this.userNum;
	}
	
	
	// 3-4. 입력받은 수와 랜덤한 수를 비교 후 비교 결과 출력
	private void checkNum() {
		if (num < userNum) {
			System.out.println("입력 값이 더 큽니다.");
		} else if (num > userNum) {
			System.out.println("입력 값이 더 작습니다");
		} else {
			System.out.println("같습니다.");
		}
	}
	
	
	// 앞에 만든 메소드들을 조립해서 실행
	// starPlaying을 main에서 사용하기 위해 public
	public void startPlaying() {
		getRandomNum(); // 랜덤한 수를 할당
		while (true) {
			this.checkUserGuess(); // 값을 입력 받아옴
			checkNum(); // 비교하여 결과 출력
			// 5. 입력받은 수와 랜덤한 수가 같을 때 게임 종료
			// 정답을 맞췄을 대 반복문을 빠져나오기 위함
			if (num == userNum) {
				break;
			}
		}
		System.out.println("종료 되었습니다.");
	}
	
}
