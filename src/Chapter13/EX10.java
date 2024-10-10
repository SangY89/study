package Chapter13;

import java.util.HashMap;
import java.util.Scanner;

// Quiz
// 사용자로 부터 키, 값 입력받아 저장(반복문 사용)
// 출력

public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < 3; i++) {
			System.out.print("키 입력: ");
			String key = input.next();
			System.out.print("값 입력: ");
			String data = input.next();
			
			map.put(key, data);
		}
		System.out.println(map);
		input.close();
		
		
	}

}
