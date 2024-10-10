package Chapter9;

class Variable9 {
	public static void func1() {
		System.out.println("Func1 Method");
		func2();
	}
	public void func2() {
		System.out.println("Func2 Method");
	}
}

public class EX11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable9.func1();
		// 객체 생성 시기가 다르기 때문에 에러가 난다.
	}

}
