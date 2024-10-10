package Chapter13;

import java.util.ArrayList;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("김상수"); list.add("이변수"); list.add("박참조");
		list.add("조클래스"); list.add("지컬렉션");
		
		System.out.println(list);
		
		list.set(0, "박상수");
		
		System.out.println(list);
	}

}
