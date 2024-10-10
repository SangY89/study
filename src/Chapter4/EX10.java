package Chapter4;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제10) 두 수를 입력 받아 큰 수가 짝수이면 출력
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int n1 = input.nextInt();
		System.out.print("수 입력 : ");
		int n2 = input.nextInt();
		
		if (n1 > n2 && n1 % 2 == 0) {
			System.out.println("큰 수이자 짝수 " + n1);
		}
		if (n2 > n1 && n2 % 2 == 0 ) {
			System.out.println("큰 수이자 짝수 " + n2);
		}
		input.close();
		}
	}


