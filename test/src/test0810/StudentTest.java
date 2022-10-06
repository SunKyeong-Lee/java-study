package test0810;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열
		// 0809 문제풀이, 배열
		// 50, 60, 36, 90, 100
		// 60점 이상일 때 합격
		// 번호는 작성된 점수 순서
		int[] scores = {50,60,36,90,100};
		int count = 0;
		int sum = 0;
		
		for (int score : scores) {
			if (score>=60) {
				count++;
				sum += score;
				System.out.println(count+"번 : 합격");
			}
		}
		System.out.println("합격자 평균 : "+sum/count);
		
		
		
		
		// Student클래스 내용 확인
		Student s1 = new Student();
		Student s2 = new Student("흥부",1);
		
		s1.setScore(80);
		s1.printResult();  // 홍길동님은 합격입니다.
		s2.printResult();  // 흥부님은 불합격입니다.

	}

}
