package test0810;

public class Student {
	
	// 필드
	String name;
	int number;
	int score;
	
	// 생성자
	Student(){
		this.name = "홍길동";
		this.number = 0;
		this.score = 0;
	}
	
	// 밖에서 값을 바꿀 수 있게 하기 위해 매개변수 사용
	Student(String name, int number) {
		this.name = name;
		this.number = number;
		this.score = 0;
	}

	// 값을 반환할 필요가 없기에 void 사용
	void setScore(int score) {
		this.score = score;
	}
	
	int getScore() {
		return this.score;
	}
	
	void printResult () {
		// 60점 이상일 때 "합격"이 출력되고, 미만일 때 "불합격" 출력
		if (score>=60) {
			System.out.println(name+"님은 합격입니다.");
		} else {
			System.out.println(name+"님은 불합격입니다.");
		}
	}
	
}
