package Chapter8;

// 8. 접근 제어자 method(private) - 해결

class AccessModifier5 {
	private String MethodTest_EX08(int x, int y) {
		if(x > y) {
			return x + "이" + y + "보다 크다.";
		} else if (x < y) {
			return y + "이" + x + "보다 크다.";
		} else {
			return x + "과" + y + "은(는) 같다.";
		}
	}
	public String subMethodTest_EX08(int x, int y) {
		String str = MethodTest_EX08(x, y);
		return str;
	}
}

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier5 am = new AccessModifier5();
		
		String str = am.subMethodTest_EX08(100, 200);
		
		System.out.println("결과 : " + str);
		
		// 접근 제어자 정리
		// 클래스, 메서드, 필드 등의 멤버에 대한 접근 권한을 설정하는데 사용됨
		// private : 해당 클래스에서만 접근 가능
		// default : 같은 패키지에서만 접근 가능
		// protected: 같은 패키지, 상속 관계만 접근 가능
		// public : 어디서든 접근 가능
	}

}
