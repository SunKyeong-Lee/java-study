package test0819;

public class Scores {
	
	// 필드
	private int korean;
	private int math;
	private int english;
	
	// 생성자
	public Scores() {
		this.korean = 0;
		this.math = 0;
		this.english = 0;
	}
	
	public Scores(int korean, int math, int english) {
		this.korean = korean;
		this.math = math;
		this.english = english;
	}
	
	// 세 점수의 평균을 반환하는 메소드
	public int avrg() {
		int avrg = (korean+math+english)/3;
		return avrg;
	}

}
