package Chapter7;

import java.util.Scanner;

class Absolute_value {
	public int Change_num() {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num >= 0) {
			return num;
		}
		else {
			return -num;
		}
	}
}

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Absolute_value AV = new Absolute_value();
		System.out.print("정수 입력: ");
		System.out.println("입력 값: " + AV.Change_num());
		System.out.print("절대값: " + AV.Change_num());
	}

}
