package Chapter9;

public class EX01 {
	static int classVariable = 100; // 클래스 변수
	int instanceVarible = 200; // 인스턴스 변수
	public static void main(String[] args) {
		int localVariable = 300; // 지역 변수
		
		System.out.println("클래스 변수: " + classVariable);
		System.out.println("인스턴스 변수: " + instanceVarible);
		System.out.println("지역 변수: " + localVariable);
		
		// TODO Auto-generated method stub
		// Instance Member & Static Member
		// Field와 Method는 Instance Member와 Static Member로 구분됨
		// Instance Member
		// 객체가 생성되어야지만, 사용할 수 있는 Field, Method를 의미
		// EX) 하나의 클래스로 여러 개의 객체를 생성 시 각 객체마다 서로 다른 값을
		// 설정하는 경우
		
		// Static Member
		// 객체가 생성되지 않아도, 사용할 수 있는 Field, Method를 의미한다.
		// EX) 하나의 클래스로 여러 개의 객체를 생성 후 모든 객체에서
		// 공통된 값을 설정해야하는 경우
	}

}
