package Chapter4;

import java.util.Scanner;

public class EX14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제14)
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = input.nextInt();
		
		switch(n % 3) {
		case 0: System.out.println("3의 배수 입니다."); break;
		default: System.out.println("3의 배수가 아닙니다.");
		}
		input.close();
	}

}
