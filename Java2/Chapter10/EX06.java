package Chapter10;

class Computer1 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer1() {} // 기본 생성자
	// 자동으로 생성된다.
}

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer1 com = new Computer1();
		System.out.println("CPU: " + com.CPU);
		System.out.println("RAM: " + com.RAM);
		System.out.println("SSD: " + com.SSD);
		
		// 생성자
		// 객체 생성 시 해당 객체의 초기화 작업을 담당
		// 필드 초기화, 메서드 호출등의 작업을 수행하며, 모든 클래스에는
		// 반드시 하나 이상의 생성자가 존재해야함.
		
		// Constructor 특징
		// - 생성자의 이름은 반드시 클래스 이름과 동일해야함
		// - 클래스의 명시된 접근 제한자를 동일하게 물려받아 적용됨
		// - 생성자를 명시하지 않을 경우 기본 생성자가 자동 추가됨
		// - 생성자는 Method와 비슷한 형식을 사용하지만, 반환 값이 없음
		// - 생성자를 명시적으로 선언한 경우 기본 생성자는 자동 추가되지 않음
		 
	}

}
