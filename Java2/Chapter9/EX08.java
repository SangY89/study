package Chapter9;

class Variable6 {
	public static int cnt = 10;
	public void func() {
		System.out.println("cnt: " + cnt);
	}
}

public class EX08 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable6 var1 = new Variable6();
		var1.func();
		Variable6 var2 = new Variable6();
		var2.func();
		Variable6 var3 = new Variable6();
		var3.func();
		// 공통적인 값은 하나의 클래스 변수로 관리해주는 것이 좋다.
	}

}
