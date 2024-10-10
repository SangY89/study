package Chapter7;

// 4. print 사용

class Test1 {
	public void MethodTest_EX05_01(){
		System.out.println(10);
	}
	
	public void MethodTest_EX05_02() {
		System.out.println(20);
	}
}

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test1 = new Test1();
		
		test1.MethodTest_EX05_01();
		test1.MethodTest_EX05_02();
		
//		System.out.println(test1.MethodTest_EX05_01() + test1.MethodTest_EX05_02());
		// The operator + is undefined for the argument type(s) void, void
	}

}
