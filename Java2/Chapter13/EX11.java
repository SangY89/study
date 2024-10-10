package Chapter13;

import java.util.HashMap;

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("세탁기", "150만원");
		map.put("건조기", "150만원");
		map.put("에어컨", "100만원");
		
		System.out.println(map);
		
		System.out.println(map.containsKey("세탁기"));
		System.out.println(map.containsKey("티비"));
		
		System.out.println(map.containsValue("100만원"));
		
		System.out.println(map.remove("에어컨"));
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
	}

}
