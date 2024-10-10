package Chapter8;

// 7. 접근 제어자 method(private)


class AccessModifier4 {
	private String MethodTest_EX06(int x, int y) {
		if(x > y) {
			return x + "이" + y + "보다 크다.";
		} else if (x < y) {
			return y + "이" + x + "보다 크다.";
		} else {
			return x + "과" + y + "은(는) 같다.";
		}
	}
}

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier4 am = new AccessModifier4();
		
		String str = am.MethodTest_EX06(100, 200);
		
		System.out.println("결과 : " + str);
		
	}

}
