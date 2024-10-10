package Chapter6;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		String odd_even = null;
		System.out.print("짝수, 홀수 입력: ");
		odd_even = input.next();
		String Even = "짝수";
		if(odd_even.equals(Even)) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 0) {
					System.out.println("짝수 : " + arr[i]);
				}
			}
		}
		else {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 1) {
					System.out.println("홀수 : " + arr[i]);
				}
			}
		}
		input.close();
	}
}

