package Chapter8;

//4. 접근 제어자 field(default) - 같은 패키지

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		EX03 am = new EX03();
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
