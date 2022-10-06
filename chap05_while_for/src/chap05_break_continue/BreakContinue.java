package chap05_break_continue;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 안에서 사용할 수 있는 키워드
		// break;
		
		// switch문에서 break;
		int num = 0;
		switch (num) {
		case 0:
			System.out.println("입력된 값은 0입니다.");
			break; // break를 사용해서 switch문을 나간다.
		default:
			System.out.println("다른 숫자값입니다.");
			break; // default에서는 break를 적지 않아도 괜찮다.
		}
		
		
		// 반복문에서 break, for문보다는 while문에서 자주 사용함
		for (int i=0; i<10; i++) {
			System.out.println(i);
			if (i==4) {
				break;	// if 없이 break를 실행하면 0만 출력되고 종료
			}
		}
		
		
		// while문에서 break
		int a = 1;
		while (true) {
			a++;
			System.out.println(a);
			if(a>10) {  // 11이 되어 a>10의 조건을 만족
				break;  // if문의 조건을 만족했을 때 break를 통해 반복문을 빠져나온다.
			}
		}
		
		
		
		
		
		// continue
		// 현재의 반복문을 건너뜀
		for (int i=0; i<10; i++) {
			if (i==4) {
				continue; 
				// 건너뛰고 싶은 코드 위쪽에 작성
				// 여기서는 4를 출력하는 코드를 건너뛰는 것을 원함
			}
			System.out.println(i); // if문보다 위에 있다면 4가 그대로 출력된다.
		}
		
		
		
	}

}
