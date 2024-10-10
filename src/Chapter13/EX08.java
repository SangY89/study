package Chapter13;

import java.util.HashSet;
import java.util.Iterator;

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("1. 다크 나이트");
		hs.add("2. 반지의 제왕");
		hs.add("3. 어벤져스");
		hs.add("4. 아이언맨");
		hs.add("5. 해리포터");
		
		Iterator<String> Iths = hs.iterator();
		
		while(Iths.hasNext()) {
			String name = Iths.next();
			System.out.println(name);
		}
	}

}
