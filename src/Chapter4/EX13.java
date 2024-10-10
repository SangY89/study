package Chapter4;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch - case - default 문 기본 구조
		// switch (상수){
		// case 상수: 실행코드; break;
		// case 상수: 실행코드; break;
		// case 상수: 실행코드; break;
		// default: 실행코드;
		// }
		// 예제 13)
		Scanner input = new Scanner(System.in);
		
		System.out.print("1 ~ 3 숫자를 입력하세요 : ");
		int n = input.nextInt();
		switch(n) {
		case 1: System.out.println("입력한 수: " + n); break;
		case 2: System.out.println("입력한 수: " + n); break;
		case 3: System.out.println("입력한 수: " + n); break;
		default: System.out.println("1~3 외 다른 수 입력");
		}
		input.close();
	}

}
