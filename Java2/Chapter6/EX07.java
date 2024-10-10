package Chapter6;

import java.util.StringTokenizer;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 값을 나눠서 쓰고 싶을 때 쓴다.
		String str1 = "Java Study Hard";
		
		StringTokenizer st1 = new StringTokenizer(str1, " ");
		System.out.println(st1.countTokens());
		System.out.println(st1.nextToken());
		System.out.println(st1.nextToken());
		System.out.println(st1.nextToken());
		
		System.out.println();
		
		String str2 = "Java/Study/Easy";
		
		StringTokenizer st2 = new StringTokenizer(str2, "/");
		System.out.println(st2.countTokens());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
	}

}
