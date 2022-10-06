package chap07_2_array;

import java.util.Calendar;

public class Order {
	
	// 필드
	private String orderNumber;
	private String id;
	private String name;
	private String productNum;
	
	// 정적변수
	private static int orderCount = 0;
	
	// 생성자
	public Order() {
		this.orderNumber = numString(); // 주문번호를 생성하는 메소드
		this.id = "";
		this.name = "";
		this.productNum = "PD-000";
	}
	
	public Order(String orderNumber, String name,
					String id, String productNum) {
		this.orderNumber = numString(); // 주문번호를 생성하는 메소드
		this.id = id;
		this.name = name;
		this.productNum = productNum;
	}
	
	// 접근자
	public String getOrderNumber() {
		return orderNumber;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() { 
		return name;
	}
	
	public String getProductNum() {
		return productNum;
	}
	
	// 설정자
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	
	// 출력 메소드
	public void printShopOrder() {
		System.out.println("주문번호 : "+getOrderNumber());
		System.out.println("아디디 : "+getId());
		System.out.println("이름 : "+getName());
		System.out.println("상품번호 : "+getProductNum());
	}
	
	// OrderNum(주문번호)를 자동으로 작성하는 메소드
	private String numString() {
		// 년도, 달, 일
		// 캘린터 객체를 이용하여 현재 날짜를 받아옴
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH)+1; // 첫 시작달이 0이라서 +1
		int date = cal.get(cal.DATE);
		
		// 정적변수 orderCount를 사용하여
		// String 20228110 이라는 값 만들기
		// 숫자값을 문자로 바꾸기 위해 Integer.toString 사용
		String numString = Integer.toString(year)
				+ Integer.toString(month)
				+ Integer.toString(date)
				+ Integer.toString(orderCount);
		
		// 0일 포함된 202208110000 값 만들기 < return은 이걸로
		// format : 문자열 안에 %d, %s와 같이 기호를 통해 변수를 넣음
		// 숫자형의 경우 숫자가 차지할 공간을 지정해 줄 수 있다 : %2d(공간 2차지)
		// 앞에 0이 붙으면 빈 공간을 0으로 채워준다 : %02d(빈공간은 0으로)
		String numZeroString = String.format("%d%02d%02d%04d", 
				year, month, date, orderCount);
		
		orderCount++;

		return numZeroString; 
	}

}
