package Chapter2;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String st;
		int num;
		float f;
		
		System.out.print("문자 입력 : ");
		st = input.nextLine();
		System.out.println("문자 출력: " + st);
		
		System.out.print("숫자 입력: ");
		num = input.nextInt();
		System.out.println("숫자 출력: " + num);
		
		System.out.print("실수 입력 : ");
		f = input.nextFloat();
		System.out.println("실수 출력: " + f);
		
		input.close();
	}

}
