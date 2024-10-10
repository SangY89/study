package Chapter10;

class Computer4 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer4(String CPU) {
		CPU = CPU;
	} 
	
	Computer4(){ } 
}

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer4 com = new Computer4();
		
		System.out.println("CPU: " + com.CPU);
		System.out.println("RAM: " + com.RAM);
		System.out.println("SSD: " + com.SSD);
		 
		// 생성자 this
		// 객체의 필드변수와 매개변수를 구분하기 위해서는 this를 사용
		// 코드의 가독성을 높이기 위해 매개변수는 필드의 이름과 
		// 동일하게 설정하는 것이 좋음
		
		// - 매개변수는 지역변수이며, 지역변수는 필드변수보다 우선순위가 높아
		// 접근이 불가능
		// - 객체의 필드변수와 매개변수를 구분하기 위해서는 this를 사용
		// - this는 현재 생성된 객체 자기자신을 의미하며, 객체 자신이
		// 갖는 필드로 접근이 가능
		// - 객체의 필드로 접근하기 위해서는 도트 (".")연산자를 사용, this 또한 동일
	}

}
