package Chapter12;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			int[] arr = {1, 2, 3};
			
			System.out.print("정수 입력: ");
			int num1 = input.nextInt();
			System.out.print("정수 입력: ");
			int num2 = input.nextInt();
			int result = num1/num2;
			System.out.println("나눗셈 결과: " + result);
			
			System.out.print("인덱스 범위 입력: ");
			int su = input.nextInt();
			for (int i = 0; i < su; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("어떠한 값을 0으로 나눌 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났습니다.");
		} catch (Exception e) {
			System.out.println("모든 실행 예외 처리 진행!");
		} finally {
			input.close();
		}
	}

}
