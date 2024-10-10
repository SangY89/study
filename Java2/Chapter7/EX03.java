package Chapter7;

class MagicHat{
	public void MethodTest_EX03(int num){
		num = num + 1;
		System.out.println(num);
	}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 마법모자를 만들고 싶을 때
		// 값을 넣었을 때 다른 값으로 
		// 1. 객체 생성
		MagicHat magichat = new MagicHat();
		
		
		// 2. 메소드 호출
		magichat.MethodTest_EX03(1);
		magichat.MethodTest_EX03(2);
		magichat.MethodTest_EX03(3);
		magichat.MethodTest_EX03(10);
		magichat.MethodTest_EX03(100);
		
	}

}
