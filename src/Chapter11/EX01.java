package Chapter11;

class MyCalc {
	public void calcMethod(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("합: " + sum);
	}
}

class Computer extends MyCalc {
	public void comMethod(int num1, int num2) {
		System.out.println("컴퓨터 계산기 실행");
		calcMethod(num1, num2);
	}
}

class HandPhone extends MyCalc {
	public void phoneMethod(int num1, int num2) {
		System.out.println("핸드폰 계산기 실행");
		calcMethod(num1, num2);
	}
}

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		com.comMethod(300, 400);
		
		System.out.println();
		
		HandPhone phone = new HandPhone();
		phone.phoneMethod(200, 700);
		
		
		
		
		// 상속(Inheritance)
		// 상속이란, 이미 잘 만들어진 클래스를 재 사용하여, 새로운 클래스를 정의하는 것을 의미
		// - 상속을 해주는 클래스를 "부모 클래스" 상속을 받는 클래스를 "자식 클래스"
		
		// - 상속작업은 자식 클래스가 상속을 받을 부모 클래스를 선택하여 상속을 진행
		// (extends 키워스 사용 / 자바는 다중상속 "X")
		
		// - 부모 클래스의 멤버요소를 자식 클래스에서도 동일하게 사용가능하며,
		// 상속받은 멤버요소들을 재정의하거나 추가하여 사용 가능
	}

}
