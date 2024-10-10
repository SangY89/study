package Chapter4;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if - else 조건문 기본 구조
//		 if(조건식){
//			실행 코드
//		 } else {
//			 실행 코드
//		 }
		// 예제6) 정수 입력 받아서 짝수 홀수 구분하는 프로그램
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = input.nextInt();
		int d = n % 10;
		if (d % 2 == 1) {
			System.out.println( n + "은 홀수 입니다.");
		} else {
			System.out.println(n + "은 짝수 입니다.");
		}
		input.close();
	}
}
