package Chapter13;

// Quiz 
// 1. ArrayList 사용하여 arr 객체 생성
// 2. 반복문 사용하여 원하는 만큼 데이터 추가
// 3. 반복문 사용하여 값 꺼내어 출력

import java.util.Scanner;
import java.util.ArrayList;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		
		String printstr;
		System.out.print("저장 공간의 수를 입력하세요: : ");
		
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print("데이터 입력: ");
			String n = input.next();
			arr.add(n);
		}
		System.out.println("------------ 저장 된 값 출력 ------------");

		for (int i = 0; i < arr.size(); i++) {
			printstr = arr.get(i);
			System.out.println(printstr);
		}
		input.close();
		
	}

}
