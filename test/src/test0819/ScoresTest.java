package test0819;

public class ScoresTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 클래스와 배열
		Scores[] scorelist = {new Scores(80, 20, 60), 
				new Scores(70, 70, 70), new Scores(80, 90, 80), 
				new Scores(60, 80, 30), new Scores(40, 60, 70)};
		
		for (int i=0; i<scorelist.length; i++) {
			System.out.println(i+"번 평균 : "+scorelist[i].avrg());
		}
		
		
		// 상속
		MiddleSchoolScore a = new MiddleSchoolScore("홍길동", 70, 80, 90);
		System.out.println(a.avrg());
		a.printArvg();
		
	}

}
