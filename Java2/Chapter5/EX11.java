package Chapter5;

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while 반복문 기본 구조
		// while(조건식) {
		//  실행코드 
		// }
		// 예제11) 1 - 10까지 짝수, 홀수 합을 for문을 사용하여 구하라
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합: " + evenSum);
		System.out.println("홀수의 합: " + oddSum);
	}
}
