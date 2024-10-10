package Chapter3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year;
		int age;
		
		System.out.print("출생년도 8자리 입력 : ");
		year = input.nextInt();
		int y = year / 10000;
		age = 2024 - y;
		System.out.println(y);
		System.out.println("나이: " + age );
		
		input.close();
	}

}
