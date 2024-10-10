package Chapter11;

import java.util.Scanner;

abstract class Machine{
	Scanner input = new Scanner(System.in);
	protected String Owner;
	protected String Serial;
	protected Machine(String Owner, String Serial) {
		this.Owner = Owner;
		this.Serial = Serial;
	}
	public abstract void turnOn();
	public abstract void machineInfo();
}

class Monitor extends Machine {
	public Monitor(String Owner, String Serial) {
		super(Owner, Serial);
	}
	@Override
	public void turnOn() {
		System.out.println("모니터 전원 On");
	}
	@Override
	public void machineInfo() {
		System.out.println("관리자: " + this.Owner);
		System.out.println("관리번호: " + this.Serial);
		System.out.println("전원을 키시겠습니까(y/n)? ");
		char flag = input.next().charAt(0);
		if (flag == 'y' || flag == 'Y') {
			turnOn();
		}
	}
}

class Com extends Machine {
	public Com(String Owner, String Serial) {
		super(Owner, Serial);
	}
	@Override
	public void turnOn() {
		System.out.println("모니터 전원 On");
	}
	@Override
	public void machineInfo() {
		System.out.println("관리자: " + this.Owner);
		System.out.println("관리번호: " + this.Serial);
		System.out.println("전원을 키시겠습니까(y/n)? ");
		char flag = input.next().charAt(0);
		if (flag == 'y' || flag == 'Y') {
			turnOn();
		}
	}
}

public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor mo = new Monitor("Admin 1", "1-100");
		mo.machineInfo();
		System.out.println();
		Com com = new Com("Admin_2", "1-200");
		com.machineInfo();
		
		
		
		
		// 추상 클래스, 메서드
		// 공통된 필드와 메서드 이름을 갖는 실체 클래스를 구현하기 위해 사용
		// 추상 클래스란 객체를 직접 생성할 수 없고(new 사용불가),
		// 상속만 가능한 클래스를 의미(extends 뒤에만 명시 가능)
		
		// 추상 메서드란 추상 클래스를 상속 받은 자식 클래스에서 반드시 포함해야
		// 하는 실체 클래스의 공통적인 메서드를 의미
	}

}
