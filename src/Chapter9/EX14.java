package Chapter9;

class Final_03 {
	public static final String KOREA = "대한민국";
	public static final String PI = "3.14";
	
}

class User1 {
	public void func() {
		System.out.println("KOREA: " + Final_03.KOREA);
		System.out.println("PI: " + Final_03.PI);
	}
}

class User2 {
	public void func() {
		System.out.println("KOREA: " + Final_03.KOREA);
		System.out.println("PI: " + Final_03.PI);
	}
}


public class EX14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 u1 = new User1();
		User2 u2 = new User2();
		u1.func();
		u2.func();
		
		
		// 상수 지정 작업
		// Static Final Field
		// 상수는 일반적으로 이름을 대문자로 구성
		// Static Final Field만 상수? 일반 Final Field의 경우 상수가 아님
		// 그 이유는 객체마다 Final Field가 객체내부에 따로 구성되기에
		// 객체 생성 시 생성자에 따라 객체마다 Final Field의 값이 달라질 수 있음
		
		// Static Final Field는 공용성을 갖는 변경이 불가능한 필드가 생성되며,
		// 모든 객체가 공용으로 사용하는 실질적인 상수의 역할을 수행할 수 있음
	}

}
