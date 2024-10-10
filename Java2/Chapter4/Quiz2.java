package Chapter4;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 정수입력: ");
		int n1 = input.nextInt();
		System.out.print("두 번째 정수입력: ");
		int n2 = input.nextInt();
		
		if(n1 > n2) {
			System.out.println("큰 값 : " + n1 + "작은 값: " + n2); 
		} else if (n2 > n1) {
			System.out.println("큰 값 : " + n2 + "작은 값: " + n1);
		} else {
			System.out.println("비교 할 수 없습니다.");
		}
		
		input.close();
	}

}
