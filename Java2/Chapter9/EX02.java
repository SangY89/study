package Chapter9;

public class EX02 {
	static int classVariable = 100; // 클래스 변수
	int instanceVarible = 200; // 인스턴스 변수
	public static void main(String[] args) {
		int localVariable = 300; // 지역 변수 
		
		EX02 iv = new EX02();
		
		System.out.println("클래스 변수: " + classVariable);
		System.out.println("인스턴스 변수: " + iv.instanceVarible);
		System.out.println("지역 변수: " + localVariable);
	}

}
