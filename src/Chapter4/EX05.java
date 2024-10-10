package Chapter4;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제5
		// 조건문 사용하여 아래와 같이 출력되는 프로그램 제작
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. easy game");
		System.out.println("2. hard game");
		System.out.println("3. exit");
		System.out.print("선택 >> ");
		int n = input.nextInt();
		
		if (n == 1) {
			System.out.println("easy game start!");
		}
		
		if (n == 2) {
			System.out.println("hard game start!");
		}
		
		if (n == 3) {
			System.out.println("exit");
		}
		input.close();
	}

}
