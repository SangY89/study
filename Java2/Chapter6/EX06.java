package Chapter6;
// StringBuffer
public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String 자료형을 사용하여 문자열 추가
		String result1 = "";
		result1 += "hello";
		result1 += ",";
		result1 += "java";
		System.out.println(result1);
		
		
		// SringBuffer 클래스 사용하여 문자열 추가
		StringBuffer sb = new StringBuffer();
		sb.append("bye");
		sb.append(",");
		sb.append("java");
		String result2 = sb.toString();
		System.out.println(result2);
	}

}
