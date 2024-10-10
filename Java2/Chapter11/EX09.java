package Chapter11;

import java.util.Scanner;

//final class A{ // 상속이 불가능한  final 클래스 
class A{ 
	protected String str;
	public A(String str) {
		this.str = str;
	}
	public void Method1() { // 오버라이딩이 되지 말아야할 메소드에 final
		System.out.println("Parents Class!");
	}
}

class B extends A{
	public B (String str) {
		super(str);
	}
	@Override
	public void Method1() {
		if (super.str.equals("Parents")) {
			super.Method1();
		} else {
			System.out.println("Child Class");
		}
	}
}

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Parents or Child input: ");
		String str = input.next();
		B test = new B(str);
		test.Method1();
		input.close();
	}

}
