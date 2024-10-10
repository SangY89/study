package Chapter10;

import java.util.Scanner;

class Sosu{
	int num;
	public void decimal(int num) {
		if(num > 0) {
			if(num % 1 == 0 && num % num == 0) {
				System.out.println(num + "은 소수 입니다.");
			} else {
				System.out.println(num + "은 소수가 아닙니다.");
			}
			
		} 
	}
}

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수를 입력 받아 소수를 판별하는 class를 만들어
		// 화면에 결과를 출력하세요.
		// (소수: 1과 자기자신만 나우어 떨어지는 1보다 큰 양의 정수)
		Scanner input = new Scanner(System.in);
		Sosu ss = new Sosu();
		
		System.out.print("정수 입력: ");
		ss.num = input.nextInt();
		ss.decimal(ss.num);
		input.close();
	}

}
