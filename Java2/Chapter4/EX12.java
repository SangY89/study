package Chapter4;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제12) 계절 구하기 3-5 봄 6-8 여름 9-11 가을 12-2 겨울
		Scanner input = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int n = input.nextInt();
		
		if (3 <= n && n <= 5) {
			System.out.println(n + "월은 봄 입니다.");
		} else if (6 <= n && n <= 8) {
			System.out.println(n + "월은 여름 입니다.");
		} else if (9 >= n && n <= 11) {
			System.out.println(n + "월은 가을 입니다.");
		} else if (12 == n || n == 2 || n == 1){
			System.out.println(n + "월은 겨울 입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		input.close();
	}
}
