package Chapter11;

class Anonperson {
	void action() {
		System.out.println("공부 시작!");
	}
}

class Anonmous {
	Anonperson A = new Anonperson() {
		@Override
		void action() { System.out.println("식사 시작!"); }
	};
	
	void method() {
		Anonperson B = new Anonperson() {
			@Override
			void action() {
				System.out.println("운동 시작!");
				action_2();
			}
			void action_2() { System.out.println("내일 부터..."); }
		};
		
		B.action();
	}
		
}

public class EX16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonmous anon = new Anonmous();
		anon.A.action();
		anon.method();
		
		
		// 익명 클래스
		// 이름이 없는 클래스를 의미하며 객체 사용 시에 클래스 선언과
		// 객체 생성이 동시에 이루어지며, 일회성으로 하나의 객체만 필요한 경우 사용
		// 부모 클래스 객체명 = new 부모클래스명 {... 내용 구현 ...};
		// 인터페이스명 객체명 = new 인터페이스명 {... 내용 구현 ...};
		
		
	}

}
