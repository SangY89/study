package Chapter13;

import java.util.HashMap;

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Test");
		hm.put(1, "hello");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));

	}

}
