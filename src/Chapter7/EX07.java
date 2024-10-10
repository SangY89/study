package Chapter7;

// 6. 지역 변수

class MethodLocalVariable{
	public void MethodTest_EX07_01() {
		int a = 10, b = 20;
		MetodTest_EX07_02(a,b);
		System.out.println("EX07_01 => a : " + a);
		System.out.println("EX07_01 => b : " + b);
	}
	
	public void MetodTest_EX07_02(int a, int b) {
		a += 100; b += 200;
		System.out.println("EX07_02 => a : " + a);
		System.out.println("EX07_02 => b : " + b);
	}
}

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalVariable localval = new MethodLocalVariable();
		
		localval.MethodTest_EX07_01();
	}
}
