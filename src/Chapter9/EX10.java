package Chapter9;

class Variable8 {
	public int cnt = 10;
	public static void func() {
		System.out.println("cnt: " + cnt);
	}
}

public class EX10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable8.func();
		// 인스턴스 변수에서 스태틱 변수를 안쓰면 에러가 발생한다.
		// Cannot make a static reference to the non-static field cnt
	}

}
