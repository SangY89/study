package Chapter10;

class Computer6 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer6(){ } 
	
	Computer6(String CPU) {
		this.CPU = CPU;
	} 
	
	Computer6(String CPU, String RAM) {
		this.CPU = CPU;
		this.RAM = RAM;
	} 
}

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer6 com1 = new Computer6(); // 기본 생성자
		Computer6 com2 = new Computer6("AMD");
		Computer6 com3 = new Computer6("AMD", "SK");
		
		System.out.println("CPU: " + com1.CPU);
		System.out.println("RAM: " + com1.RAM);
		System.out.println("SSD: " + com1.SSD);
		
		System.out.println("CPU: " + com2.CPU);
		System.out.println("RAM: " + com2.RAM);
		System.out.println("SSD: " + com2.SSD);
		
		System.out.println("CPU: " + com3.CPU);
		System.out.println("RAM: " + com3.RAM);
		System.out.println("SSD: " + com3.SSD);
		
		
		// 생성자 오버로딩
		// 같은 class내의 동일한 이름의 생성자를 여러 개 선언하는 것을 의미
		// 생성자 오버로딩의 조건은 매개변수의 개수를 다르게 구성해야함
		// - 외부에서 제공되는 다양한 데이터에 따른 객체 초기화를 위해 사용
		// - 생성자 오버로딩시 this를 활용하여 중복코드를 최소화 시킬 수 있음
		// - 생성자 오버로딩은 매개변수의 타입, 순서는 조건에 포함되지 않음
	}

}
