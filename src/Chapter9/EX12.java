package Chapter9;

import java.util.Scanner;

class Final_01 {
	final String nation = "KOREA";
	String ssn = "000000-000000";
	String name;
}

public class EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_01 person = new Final_01();
		Scanner input = new Scanner(System.in);
		System.out.print("이름: ");
		person.name = input.next();
		System.out.print("주민등록번호: ");
		person.ssn = input.next();
		input.close();
		
		System.out.println("국가: " + person.nation);
		System.out.println("이름: " + person.name);
		System.out.println("주민등록번호: " + person.ssn);
		
		
		// final field
		// final field로 설정된 Field는 프로그램 종료시까지 수정이 불가능
		// 프로그램 종료까지 고정된 값을 반드시 가져야하는 필드에 적용
		// 여러가지 이유로 인해 필드에 값이 변경되는 것을 방지
		// EX) 세금계산 프로그램에서 세율을 저장하는 필드 변수
		
		// 주의사항
		// final field로 설정된 Field를 초기화하지 않을 경우 Error가 발생
		// final field의 초기값 지정은 Field 생성시 정의하거나, 생성자를 사용
		// final field의 값은 객체 생성시 생성자에 따라 값이 달라질 수 있음
	}

}
