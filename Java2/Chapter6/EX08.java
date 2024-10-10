package Chapter6;

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("java is Easy");
		System.out.println("기본: " + str);
		System.out.println("소문자 변환: " + str.toLowerCase());
		System.out.println("대문자 변환: " + str.toUpperCase());
		
		String changeStr = new String();
		changeStr = str.replace("Easy", "Hard");
		System.out.println("문자열 치환: " + changeStr);
		
		String[] arrStr = str.split("is");
		System.out.println("문자열 분리: " + arrStr[0] + "*");
		System.out.println("문자열 분리: " + "*" + arrStr[1]);
		
		String[] arrStr2 = str.split("is");
		arrStr[0] = arrStr[0].trim();
		arrStr[0] = arrStr[0].trim();
		System.out.println("문자열 분리: " + arrStr2[0] + "*");
		System.out.println("문자열 분리: " + "*" + arrStr2[1]);
	}

}
