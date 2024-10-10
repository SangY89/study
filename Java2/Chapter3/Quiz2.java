package Chapter3;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int year;
		
		System.out.print("출생년도 8자리 입력 : ");
		year = input.nextInt();
		int y = year / 10000;
		int m = year % 10000 / 100;
		int d = year % 100;
		System.out.printf("년: %d  월: %d 일: %d", y, m, d );
		
		input.close();
	}	

}
