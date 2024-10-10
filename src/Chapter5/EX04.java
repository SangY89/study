package Chapter5;

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제4) 1 ~ 10 까지 합을 구하시오.
		// 단 반복문 사용
		int sum = 0;
		
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		// 1번
//		for (int i = 1; i < 11; i++) {
//			int iSum = 0;
//			iSum = iSum + i;
//			System.out.println("합: " + iSum);
//		}
		
		// 2번
		int iSum = 0;
		for (int i = 1; i < 11; i++) {
		iSum = iSum + i;
//		System.out.println("합: " + iSum);
//		합: 1 i = 1 iSum + i = 1 
//		합: 3 i = 2 iSum + i = 3
//		합: 6 i = 3 iSum + i = 6
//		합: 10 i = 4 iSum + i = 10
//		합: 15 i = 5 iSum + i = 15
//		합: 21 i = 6 iSum + i = 21 
//		합: 28 i = 7 iSum + i = 28
//		합: 36 i = 8 iSum + i = 36
//		합: 45 i = 9 iSum + i = 45
//		합: 55 i = 10 iSum + i = 55
		}
		System.out.println("합: " + iSum);

		
		for (int i = 0; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
