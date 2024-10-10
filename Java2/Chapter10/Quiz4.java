package Chapter10;

import java.util.Scanner;

class judgment {
	int num;
	public void addeven (int num) {
		if (num % 2 == 0) {
			System.out.println("결과: " + num + "은 짝수");
		} else {
			System.out.println("결과: " + num + "은 홀수");
		}
	}
}

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 수 입력 받아 짝수 홀수 판단하는 클래스 정의하여
		// 결과 값 아래와 같이 반환되게 하시오.
		Scanner input = new Scanner(System.in);
		judgment jd = new judgment();
		System.out.print("수 입력: ");
		jd.num = input.nextInt();
		jd.addeven(jd.num);
		input.close();
		
		
		
	}

}
