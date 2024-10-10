package Chapter13;

import java.util.ArrayList;
import java.util.HashSet;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("라면"); al.add("김밥"); al.add("튀김");
		al.add("떡볶이"); al.add("순대");
		
		System.out.println(al);
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("라면"); hs.add("김밥"); hs.add("튀김");
		hs.add("떡볶이"); hs.add("순대");
		
		System.out.println(hs);
		
		hs.remove("순대");
		System.out.println(hs);
		
		
	}

}
