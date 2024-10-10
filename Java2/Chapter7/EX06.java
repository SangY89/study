package Chapter7;

// 5. return 사용

class Test2 {
	public int MethodTest_EX06_01() {
		return 10;
	}
	public int MethodTest_EX06_02() {
		return 20;
	}
}

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// + 인자를 사용 가능
		// 콘솔에서 값을 보고 싶을 경우 print 꼭 사용
		Test2 test2 = new Test2();
		
		System.out.println(test2.MethodTest_EX06_01());
		System.out.println(test2.MethodTest_EX06_02());
		
		System.out.println(test2.MethodTest_EX06_01() + test2.MethodTest_EX06_02());
		
	}

}
