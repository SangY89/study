package Chapter2;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수
		// 데이터 또는 자료를 저장하기 위한 메모리의 공간
		// 값을 넣고 빼며 사용함
		
		// 변수 선언 방식
		// 변수 생성 방법 1 : 선언 후 초기화
		// 자료형 변수명;
		// 변수명 = 값
		
		// 변수 생성 방법 2 : 선언과 동시에 초기화
		// 자료형 변수명 = 값;
		
		// 변수 생성 방법 3 : 다른 변수를 활용하여 초기화
		// 자료형 변수명1 = 값;
		// 자료형 변수명2 = 변수명1
		
		// 변수 작명 규칙
		// - 영문자 대/소문자, 숫자, _(Underline), $의 조합으로만 구성
		// - 숫자의 경우 가장 첫 글자로 사용 불가
		// - 다른 곳에서 사용되고 있는 이름은 사용 불가
		// - 변수명에서는 공백 포함 불가
		
		// 변수 생성 방법1
		int a1;
		a1 = 10;
		System.out.println(a1);
		
		// 변수 생성 방법2
		int a2 = 20;
		System.out.println(a2);
		
		// 변수 생성 방법3
		int a3 = a2;
		System.out.println(a3);
		
	}

}
