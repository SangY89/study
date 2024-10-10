package Chapter5;

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 for 반복문 기본 구조
		// for(초기값; 조건식; 증감식) {
		//	 for(초기값; 조건식; 증감식) {
		//		 실행코드
		// 	 }
		// }
		for (int i = 0; i <= 2; i++) {
			System.out.println("첫 번째 for문");
			for (int j = 0; j <= 1; j++) {
				System.out.println("두 번째 for문");
			}
		}
	}

}
