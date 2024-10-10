package Chapter6;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Class & Operator
		// 메서드					설명
		// .length()			지정된 문자열의 길이값을 반환
		// .cahrAt(index)		지정된 Index에 단일 문자값을 반환
		// + operator : 기존 문자열 데이터에 새로운 문자값을 이어 붙임
		
		String str = new String("JavaProgramming");
		
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		
		String addStr;
		addStr = "A";
		System.out.println(addStr);
		addStr += "B";
		System.out.println(addStr);
		
		System.out.println(str.charAt(0) == 'J');
		System.out.println(str.charAt(0) == 'j');
		System.out.println(str.charAt(1) - 32);
		System.out.println((char)(str.charAt(1) - 32));
	}

}
