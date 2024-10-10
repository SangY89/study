package Chapter12;

class UserException6 extends Exception {
	// 일반 예외
}

class ExceptionTest6 {
	public void printName(String name) throws UserException6 {
			if("펭수".equals(name)) {
				throw new UserException6();
			}
			System.out.println(name + "님 안녕하세요.");
			System.out.println(name + "님 반갑습니다.");
			System.out.println(name + "님 또 만나요.");
	}
}

public class EX17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스에 메소드를 생성하여 이름을 전달 받아
		// 인사말을 출력되게 하시오.
		ExceptionTest6 et6 = new ExceptionTest6();
		try {
		et6.printName("펭수");
		et6.printName("범이");
		} catch (UserException6 e) {
			System.out.println("UserException6 이 발생했습니다.");
		}
		
		// 예외 전가
		// 사용자의 잘못된 조작이나, 개발자의 잘못된 코드작성으로 발생하는 프로그램상의 오류
		// throw : 메서드 내에서 예외를 발생시킬 때 사용
		// throws : 실행중인 메서드 내부에서 발생한 예외를 다른 곳으로 전가
		
	}
}
