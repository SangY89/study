package Chapter5;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제8) 두 수를 입력 받아 입력 받은 두 수의 범위
		// 안의 합을 구하시오.
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int n1 = input.nextInt();
		System.out.print("수 입력 : ");
		int n2 = input.nextInt();
		int nSum = 0;
		
		if(n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				nSum += i;
				} 	
		} else if (n1 > n2) {
			for (int i = n2; i <= n1; i++) {
				nSum += i;
				}
		} else {
			System.out.println("두 수는 같습니다.");
		}
		
		System.out.println("합: " + nSum);
		input.close();
	}
}


