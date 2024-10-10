package Chapter9;

import java.util.Scanner;

class Final_02 {
	final String nation = "KOREA";
	final String ssn = "000000-000000";
	String name;
}

public class EX13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_02 person = new Final_02();
		Scanner input = new Scanner(System.in);
		System.out.print("이름: ");
		person.name = input.next();
		System.out.print("주민등록번호: ");
		person.ssn = input.next();
		input.close();
		
		System.out.println("국가: " + person.nation);
		System.out.println("이름: " + person.name);
		System.out.println("주민등록번호: " + person.ssn);
		
		// 변경되지 말아야할 필드에 final을 넣어줘야함
	}

}
