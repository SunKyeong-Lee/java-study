package chap07_1_accessB;

public class BankAcc {
	
	public String bankNum;
	private int money;
	
	public void BankAcc(String s) {
		this.bankNum = s;
		this.money = 0;
	}

	public int getMoney() {
		return this.money;
	}
	
	public void inMoney(int a) {
		this.money += a;
	}
	
	public void outMoney(int a) {
		this.money -= a;
	}
	
}
