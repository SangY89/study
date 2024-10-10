package Chapter4;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제8) 두 수를 입력 받아 큰 수를 출력
		Scanner input = new Scanner(System.in);
		
		System.out.print("수를 입력 하시오 : ");
		int num1 = input.nextInt();
		System.out.print("수를 입력 하시오 : ");
		int num2 = input.nextInt();
		
		if (num1 > num2 ) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		input.close();
	}

}
