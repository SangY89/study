package Chapter2;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int k, e, m;
		String n;
		
		System.out.print("당신의 이름은 무엇입니까? ");
		n = input.next();
		
		System.out.print(n + "님의 국어 점수 : ");
		k = input.nextInt();
		
		System.out.print(n + "님의 영어 점수 : ");
		e = input.nextInt();
		
		System.out.print(n + "님의 수학 점수 : ");
		System.out.println();
		m = input.nextInt();
		
		int hap = k + e + m;
		
		System.out.println("===================================");
		System.out.println("이름 : " + n);
		System.out.println("===================================");
		System.out.println("국어 : " + k);
		System.out.println("영어 : " + e);
		System.out.println("수학 : " + m);
		System.out.println("===================================");
		System.out.println("합계 : " + hap);
		System.out.println("===================================");
		
		input.close();
	}

}
