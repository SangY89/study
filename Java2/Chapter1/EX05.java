package Chapter1;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\\(^-^)/");
		// 이스 케이프 문자
		// 이스 케이프 문자는 문자열을 출력하기 위해서 사용되는 기능외의
		// 부가적인 기능을 사용하기 위해 쓰이는 문자
		// \n \t \' \" \\
		// 다음줄로 이동, Tab 기능, '문자, "문자, \문자
		
		// 이스케이프 문자
		System.out.println("HELLO\nJAVA");
		System.out.println("HELLO\tJAVA");
		System.out.println("내 이름은 \"펭수\"입니다.");
		System.out.println("내 이름은 \'펭수\'입니다.");
		System.out.println("내 이름은 \\펭수\\입니다.");
	}
}
