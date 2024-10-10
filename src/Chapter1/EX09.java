package Chapter1;

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 자료형(참조 타입)
		System.out.println("String");
		
		System.out.println("2024-1-9");
		System.out.println(2024-1-9);	// 쌍따옴표가 없으면 연산처리가 된다.
		
		System.out.println("hello" + "java"); // 유일하게 + 연산자를 쓸 수 있다.
		
		// + 연산에서 자동 타입 변환
		System.out.println("hello" + 100); // 문자열 + 정수 = "문자열"
		System.out.println(100 + 200); // 정수 + 정수 = 정수
		System.out.println(123.456 + 789); // 실수 + 정수 = 실수
	}

}
