package Chapter8;

// 1. 접근 제어자 field(private)

import java.util.Scanner;

class AccessModifier2 {
	private String name;
	private int age;
	private String addr;
}

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		AccessModifier2 am = new AccessModifier2();
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
