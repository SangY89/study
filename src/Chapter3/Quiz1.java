package Chapter3;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String id;
		String pw;
		
		System.out.print("ID를 입력하세요: ");
		id = input.next();
		
		System.out.print("PW를 입력하세요: ");
		pw = input.next();
		System.out.println();
		
		System.out.println("====== 회원가입 완료 ======");
		System.out.println("ID: " + id);
		System.out.println("PW: " + pw);
		
		input.close();
	}

}
