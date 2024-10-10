package Chapter10;

import java.util.Scanner;

class Person2 {
	String name = "펭수";
	int age = 20;
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	} // 객체에 인스턴스 변수를 직접 지정할때 사용함
}

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 per = new Person2();
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = input.next();
		System.out.print("나이 입력: ");
		int age = input.nextInt();
		per.setPerson(name, age);
		System.out.println("이름 : " + per.name);
		System.out.println("나이 : " + per.age);
		input.close();
		
		
		// 생성자 this
		// 객체 자기자신을 의미하며, 객체 내부에서 인스턴스 멤버에 접근 시 사용됨
		// 주로 생성자와 메서드의 매개변수의 이름이 필드이름과 동일할 때 사용
		// - 매개변수는 지역변수로 구성되며, 인스턴스 변수보다 우선순위가 높음
		// - 지역변수와 필드이름이 동일한 경우 인스턴스 변수에 접근이 불가능
		// - 만약 동일이름 구조에서 인스턴스 변수에 접근하기 위해서는 this를 사용
	}

}
