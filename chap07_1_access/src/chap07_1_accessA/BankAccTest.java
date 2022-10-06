package chap07_1_accessA;

//서로 다른 패키지에 있으면 import로 들고와서 사용 가능
import chap07_1_accessB.BankAcc;

public class BankAccTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BankAcc 내용 확인
		BankAcc bank1 = new BankAcc();
		bank1.inMoney(1000);
		System.out.println(bank1.getMoney());  // 1000
		
		// outMoney메소드 수정하여 출금 금액이 클 때, 못 빠져 나가게 할 수 있다.
		bank1.outMoney(3000);
		System.out.println(bank1.getMoney());  // -2000

	}

}
