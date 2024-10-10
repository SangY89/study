package Chapter4;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("------------ Menu ------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("-------------------------------");
		System.out.print("메뉴 선택: ");
		int n = input.nextInt();
		System.out.println("-------------------------------");
		if (n == 1) {
			System.out.println("주문하신 음료는 아메리카노 입니다.");
			System.out.println("-------------------------------");
		} else {
			System.out.println("주문하신 음료는 카페라떼 입니다.");
			System.out.println("-------------------------------");
		}
		input.close();
	}
}
