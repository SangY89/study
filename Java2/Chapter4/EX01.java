package Chapter4;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제어문
		// 조건문 if, swich
		// 반복문 for, while, do ~ while
		// if 조건문 기본 구조
		// if(조건식){
		// 실행코드	
		//	}
		
		// 예제1)
		// 정수 1개 입력 받아서 1일 때 "1입니다."
		// 문자열 출력하는 코드를 작성하시오.
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int num = input.nextInt();
		if (num == 1) {
			System.out.println("1입니다.");
		}
		input.close();
		
	}

}
