package Chapter11;

class Upcasting_P {
	public String name;
	Upcasting_P(String name){
		this.name = name;
	}
	public void getClassName() {
		System.out.println(name);
	}
}

class Upcasting_C1 extends Upcasting_P {
	Upcasting_C1(String name){
		super(name);
	}
	@Override
	public void getClassName() {
		System.out.println(name);
	}
}

class Upcasting_C2 extends Upcasting_P {
	Upcasting_C2(String name){
		super(name);
	}
	@Override
	public void getClassName() {
		System.out.println(name);
	}
	public void Child_No2() {
		System.out.println("Child_No2_Method!");
	}
}

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upcasting_P upcasting = new Upcasting_P("Parents");
		upcasting.getClassName();
		
		upcasting = new Upcasting_C1("Child_No1");
		upcasting.getClassName();
		
		upcasting = new Upcasting_C2("Child_No2");
		upcasting.getClassName();
		// upcasting.Child_No2();
		// The method Child_No2() is undefined for the type Upcasting_P
		// 업캐스팅된 자식클래스에 접근 x
		// 오버라이딩 클래스는 접근 가능
		
		
		// UP-casting & Down-casting
		// 공통된 필드와 메서드 이름을 갖는 실체 클래스를 구현하기 위해 사용
		// UP-Casting은 자식 클래스타입을 부모 클래스타입으로 변환하는 것
		// Down-Casting은 부모 클래스타입을 자식 클래스타입으로
		// 강제로 변환 시키는 것(강제 타입 변환)
	}

}
