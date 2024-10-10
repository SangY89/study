package Chapter13;

import java.util.ArrayList;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("가");
		list.add("나");
		list.add("다");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println();
		list.remove("가");
		System.out.println(list.get(0));
		
		list.clear();
		System.out.println(list.get(0));
	}

}
