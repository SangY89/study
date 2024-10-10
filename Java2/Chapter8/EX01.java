package Chapter8;

// 1. 접근 제어자 field(public)

import java.util.Scanner;

class AccessModifier1 {
	public String name;
	public int age;
	public String addr;
}

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		AccessModifier1 am = new AccessModifier1();
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
		
		// 패키지(package)
		// 자바의 디렉터리로 관련된 클래스를 묶어놓아 그룹화하고 코드의 유지보수성을 향상
		// packge 패키지명
		// import 패키지명
		// 접근 제한자(access modifier)
		// 클래스, 메서드, 필드 등의 멤버에 대한 접근 권한을 설정하는데 사용됨
		// Public
		// 동일 패키지 클래스 내부, 외부에서 모두 접근이 가능한 접근 제한자
		// 다른 패키지의 클래스 또한 접근이 가능
		
		// Private
		// 클래스 내부에서만 접근이 가능하며, 다른 클래스에서는 접근이 불가능
		// 다른 패키지의 클래스 또한 접근이 불가능
		
		// Protected
		// 동일 패키지에서는 접근이 가능하며, 다른 패키지에서는 접근이 불가능
		// 상속된 자식클래스에서는 어디에서든 접근이 가능
		
		// Default
		// 접근 제한자에 대한 명시가 없을 경우 Default 접근 제한자가 설정됨
		// 동일 패키지에서는 접근이 가능하며, 다른 패키지에서는 접근이 불가능
	}

}
