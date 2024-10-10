package Chapter11;

import Chapter11.A1.B;

class A1 {
	A1() { System.out.println("상위 클래스 A 객체 생성"); }
	
	class B {
		B() { System.out.println("인스턴스 클래스 B 객체 생성 "); }
		int field1;
		void method1() { System.out.println("인스턴스 클래스 B 메서드"); }
	}
	
	static class C {
		C() { System.out.println("정적 클래스 C 객체 생성"); }
		int field1;
		void method1() { System.out.println("정적 클래스 C 메서드"); }
		static  int field2;
		static void method2() {System.out.println("정적 클래스 C 정적 메서드"); }
	}
	void method() {
		class D {
			D() { System.out.println("로컬 클래스 D 객체 생성"); }
			int field1;
			void method1() { System.out.println("로컬 클래스 D 메서드"); }
	}
	D d = new D();
	d.field1 = 3;
	d.method1();
	
	}
}
public class EX15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a 객체 생성
		A1 a = new A1();
		
		// b 객체 생성
		A1.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// c 객체 생성
		A1.C c = new A1.C();
		c.field1 = 3;
		c.method1();
		
		A1.C.field2 = 3;
		A1.C.method2();
		
		
		a.method();
		
		
		
		
		
		
		
		
		
		// 이너 클래스
		// 클래스 내부에 또 다른 클래스가 선언되는 구조
		// 인스턴스 멤버 클래스
//		class A{
//			class B {
//				
//			}
//		}
		// 상위 클래스를 객체를 생성해야지만 객체 생성이 가능한 내부 하위 클래스
		// (인스턴스 멤버 특징)
	
		// 정적 멤버 클래스
//		class A {
//			static class B {
//				
//			}
//		}
		// 상위 클래스 객체 생성 없이 바로 객체 생성 후 사용이 가능한 내부 하위 클래스
		// (정적 멤버 특징)
		
		// 로컬 클래스
//		class A {
//			void method() {
//				class B{
//					
//				}
//			}
//		}
		// 메서드 내부에 정의되며, 해당 메서드가 실행될 때에만 객체 생성이 가능한 내부 클래스
		// (로컬 특징)
	}

}
