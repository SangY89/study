package Chapter5;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("수를 입력 하시오: ");
		int n = input.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		
		
		for (int i = 1; i < n+1; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}
			else{
				oddSum += i;
			}
		}
		System.out.println("짝수의 합: " + evenSum);
		System.out.println("짝수의 합: " + oddSum);
		input.close();
	}

}
