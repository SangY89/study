package Chapter5;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수를 입력 받고 "특정 키(0)" 를 입력할 때가지 반복
		// 되도록 하고 종료 시 입력한 숫자들의 합을 출력하시오.
		Scanner input = new Scanner(System.in);
		int hap = 0;
		
		while(true) {
			System.out.print("수를 입력 하세요: ");
			int n = input.nextInt();
			hap += n;
			if(n == 0) {
				break;
			}
		}
		System.out.println("입력한 숫자들의 합: " + hap);
		input.close();
	}
		
}
