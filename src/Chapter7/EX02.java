package Chapter7;

// method(메소드) 쓰는 이유

// 1. 긴 코드 축약

class Hi1 {
	public void MethodTest_EX02() {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		System.out.println("또 만나요");
	}
}

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메서드(method)
		// 메서드는 특정 기능을 하는 코드의 집합으로 다른 언어에서는 함수를 의미하며,
		// 객체의 메서드에 접근할 때에는 도트(".") 연산자를 사용
		// class 클래스명 {
		//	     리턴자료형 메서드 명(매개 변수, ...) {
		//		 ...
		//		 return 리턴값;
		//		 }
		// 	 }
		
		// 1. 객체 생성
		Hi1 hi = new Hi1();
		
		// 2. 메소드 호출
		hi.MethodTest_EX02();
		
	}

}
