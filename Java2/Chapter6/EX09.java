package Chapter6;

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열
		// 같은 타입의 데이터를 연속된 공간에 나열하고, 인덱스를 부여해 놓은 자료구조
		// 배열은 동일한 타입만 연속적으로 저장이 가능하고, 
		// 한 번 생성된 배열의 크기는 조절할 수 없음
		// 배열 작업 시 사용가능한 기능
		// [배열 길이확인: .length, 배열 복사: System.arraycopy()]
		// 배열의 인덱스 번호는 항상 "0"번 부터 시작
		
		// 배열 선언 방법
		// 타입[] 변수 = new 타입[길이];
		// 변수[인덱스] = 값;
		
		// 타입[] 변수 = new 타입[길이] {값0, 값1, 값2, 값3, ...};
		
		// 타입[] 변수 = {값0, 값1, 값2, 값3, ...};
		
		// 타입[] 변수;
		// 변수 = new 타입[] {값0, 값1, 값2, 값3, ...};
		
		// 배열 선언
		int[] arrayInt1 = new int[10];
		
		// 초기화
		arrayInt1[0] = 1;
		arrayInt1[9] = 10;
		
		// 출력
		System.out.println(arrayInt1[0]);
		System.out.println(arrayInt1[9]);
		
		// 기본값 확인
		System.out.println(arrayInt1[7]);
		
		int[] arrayInt2 = new int[3];
		System.out.println(arrayInt2[0]);
		System.out.println(arrayInt2[1]);
		System.out.println(arrayInt2[2]);
		
		System.out.println(arrayInt2[3]);
		// 없는 인덱스에 접근했을 경우
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	}

}
