package Chapter8;

// 5. 접근 제어자 field(default) - 다른 패키지

import java.util.Scanner;
import Test.EX01;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		EX01 am = new EX01();
		System.out.print("이름: ");
		am.name = input.next();
		System.out.print("나이: ");
		am.age = input.nextInt();
		System.out.print("주소: ");
		am.addr = input.next();
		
		System.out.println("이름: " + am.name);
		System.out.println("나이: " + am.age);
		System.out.println("주소: " + am.addr);
		
		input.close();
	}

}
