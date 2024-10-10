package Chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Test");
		arr.add("String");
		
		System.out.println(arr.contains("Test"));
		System.out.println(arr.contains("String"));
		System.out.println(arr.contains("String1"));
		

		Scanner input = new Scanner(System.in);
		System.out.println("검색 데이터 입력: ");
		String searchData = input.next();
		if(arr.contains(searchData)) {
			System.out.println("입력하신 데이터는 존재합니다.");
		} else {
			System.out.println("입력하신 데이터는 존재하지 않습니다.");
		}
		input.close();
		
	}

}
