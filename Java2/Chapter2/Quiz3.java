package Chapter2;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 키와 몸무게를 입력받아 bmi를 구하시오.
		Scanner input = new Scanner(System.in);
		float k;
		float w;
		float bmi;
		
		
		System.out.print("키 입력 : ");
		k = input.nextFloat();
		System.out.print("몸무게 입력 :");
		w = input.nextFloat();
		float h = k / 100;
		
		bmi = w / (h*h);
		
		System.out.printf("bmi : " + bmi);
		input.close();
	}

}
