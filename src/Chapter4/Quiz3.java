package Chapter4;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			
		System.out.println("국어 점수 입력: ");
		int k = input.nextInt();
		System.out.println("영어 점수 입력: ");
		int e = input.nextInt();
		System.out.println("수학 점수 입력: ");
		int m = input.nextInt();
		
		int sum = k + e + m;
		int avr = sum / 3;
		
		if (avr > 70) {
			System.out.println("합격!");
		} else if(avr < 70) {
			System.out.println("불합격");
		} else if (70 > k || 70 > e || 70 > m) {
			System.out.println("불합격");
		}
		
		input.close();
	}

}
