package chap07_1_accessA;

//서로 다른 패키지에 있으면 import로 들고와서 사용 가능
import chap07_1_accessB.AccessB;

public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 같은 패키지 안에 들어있음
		AccessA a = new AccessA();
		
		// 다른 패키지 안에 들어있음
		// import로 들고와서 사용 가능
		AccessB b = new AccessB();
		b.printName();
		
	}

}


