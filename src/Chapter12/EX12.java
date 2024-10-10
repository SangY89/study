package Chapter12;

class ExceptionTest1 {
	public void printName(String name) {
		if("펭수".equals(name)) {
			return;
		}
		System.out.println(name + "님 안녕하세요.");
		System.out.println(name + "님 반갑습니다.");
		System.out.println(name + "님 또 만나요.");
	}
}

public class EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스에 메소드를 생성하여 이름을 전달 받아
		// 인사말을 출력되게 하시오.
		ExceptionTest1 et1 = new ExceptionTest1();
		et1.printName("펭수");
		et1.printName("범이");
		
	}

}
