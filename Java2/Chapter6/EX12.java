package Chapter6;

public class EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제1)
		// 배열1 > 1 ~ 100 까지 정수 값 담기(for문 사용)
		int[] arraynum1 = new int[100];

		
		for (int i = 1; i < arraynum1.length; i++) {
			arraynum1[i] = i + 1;
		}

		// 배열2 > 1 ~ 100 까지 정수 값 꺼내서 출력(for문 사용)
		for (int i = 1; i < arraynum1.length; i++) {
			System.out.println(arraynum1[i]);
		}
		
		// 배열3 > 1 ~ 100 까지 정수 합 구하여 출력(for문 사용)
		int sum = 0;
		for (int i = 1; i < arraynum1.length; i++) {
			sum += arraynum1[i];
		}
		System.out.println("총 합: " + sum);
	}

}
