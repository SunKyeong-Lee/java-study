package chap07_2_array;

import java.util.Calendar;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 캘린더 클래스 확인
		Calendar cal = Calendar.getInstance();
		// cal안에서 원하는걸 골라 쓴다 - 2022 8 11
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH)+1); // 첫 시작달이 0으로 시작
		System.out.println(cal.get(cal.DATE));
		
		System.out.println(cal.get(cal.HOUR));
		System.out.println(cal.get(cal.MINUTE));
		
		
		
		
		// 배열 생성, 배열 안의 각각의 클래스객체 생성
		Order[] orders = new Order[10];
		orders[0] = new Order("", "abc123", "홍길동", "PD-123");
		orders[0].printShopOrder();
		
		// 캘린더 클래스로 만든 주문번호 내용 확인
		orders[1] = new Order();
		System.out.println(orders[1].getOrderNumber());
		
		// orders[2]~orders[9]까지 new Order();를 이용하여 객체를 생성하고
		// orders[2]~orders[9]까지 getOrderNumber를 출력하기
		for (int i=0; i<orders.length; i++) {
			orders[i] = new Order();
		}
		
		for (Order order : orders) {
			System.out.println(order.getOrderNumber());
		}
		
	}

}
