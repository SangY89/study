package Chapter7;

// 3. 긴 코드 축약 + 마법모자를 만들고 싶을때(매개 변수)

class Hi2{
	public void MethodTest_EX04(String name) {
		System.out.println(name + "님 안녕하세요");
		System.out.println(name + "님 반갑습니다");
		System.out.println(name + "님 또 만나요");
	}
}

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 객체 생성
		Hi2 hi = new Hi2();
		
		// 2. 메소드 호출
		hi.MethodTest_EX04("윈터");
		hi.MethodTest_EX04("아이유");
		hi.MethodTest_EX04("태연");
	}

}
