package Chapter5;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// continue : 반복의 처음으로 이동
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 - 10 까지 정수 입력: ");
			int n = input.nextInt();
			if(n <= 10) {
				System.out.println("반복 종료");
				break;
			} else {
				System.out.println("다시 입력 해주세요.");
				continue;
			}
		}
		input.close();
		
	}

}
