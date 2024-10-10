package Chapter13;

import java.util.ArrayList;

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2024);
		list.add(1);
		list.add(31);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 타입 지정(Generic)
		// ArrayList(Integer)
		// ArrayList(Double)
		// ArrayList(String)
	}

}
