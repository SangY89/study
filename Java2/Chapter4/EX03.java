package Chapter4;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1000000
		// 1000001
		// 1000002
		// 예제 3
		// 정수 입력 받아서 끝자리로 짝수 홀수 구분하는 프로그램
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = input.nextInt();
		int d = n % 10;
		if (d == 1) {
			System.out.println( n + "은 홀수 입니다.");
		}
		if (d == 3) {
			System.out.println( n + "은 홀수 입니다.");
		}
		if (d == 5) {
			System.out.println( n + "은 홀수 입니다.");
		}
		if (d == 7) {
			System.out.println( n + "은 홀수 입니다.");
		}
		if (d == 9) {
			System.out.println( n + "은 홀수 입니다.");
		}
		if (d == 0) {
			System.out.println(n + "은 짝수 입니다.");
		}
		if (d == 2) {
			System.out.println(n + "은 짝수 입니다.");
		}
		if (d == 4) {
			System.out.println(n + "은 짝수 입니다.");
		}
		if (d == 6) {
			System.out.println(n + "은 짝수 입니다.");
		}
		if (d == 8) {
			System.out.println(n + "은 짝수 입니다.");
		}
		input.close();
	}

}
