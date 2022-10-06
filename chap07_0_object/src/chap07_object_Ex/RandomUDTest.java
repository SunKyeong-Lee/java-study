package chap07_object_Ex;

public class RandomUDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Math.random()
		// 수가 랜덤 생성, random의 범위 0 < random(실수) < 1
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		
		
		// 실습 내용 확인 : RandomUD
		RandomUD game = new RandomUD();
		game.startPlaying();  // 캡슐화

	}

}
