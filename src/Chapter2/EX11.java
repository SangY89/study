package Chapter2;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scanner = new Scanner(System.in);
		// String 변수 = scanner.nextLine();
		// Scanner 를 사용하여 입력 작업을 수행할 수 있으며, 아래와 같은 메서드를 포함하고 있음
		// next()			문자열 한 개를 공백을 기준으로 읽음
		// nextInt()		int 값 한 개를 공백을 기준으로 읽음
		// nextFloat()		float 값 한 개를 공백을 기준으로 읽음
		// nextDouble()		double 값 한 개를 공백을 기준으로 읽음
		// nextLine()		문자열을 개행 기준으로 읽음
		// close()		 	입력을 마친 후 종료
		
		// 입력 > Scanner 사용
		Scanner scanner = new Scanner(System.in);
		String data;
		
		data = scanner.nextLine();
		System.out.println("저장 값 : " + data);
		
		scanner.close();
	}

}
