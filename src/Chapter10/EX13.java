package Chapter10;

class Computer8 {
	String CPU;
	String RAM;
	String SSD;
	
	Computer8(){ 
		this("Intel", "Samsung", "Samsung");
	} 
	
	Computer8(String CPU) {
		this(CPU, "Samsung", "Samsung");
	} 
	
	Computer8(String CPU, String RAM) {
		this(CPU, RAM, "Samsung");
	} 
	
	Computer8(String CPU, String RAM, String SSD){
		this.CPU = CPU;
		this.RAM = RAM;
		this.SSD = SSD;
	}
}

public class EX13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer8 com1 = new Computer8(); // 기본 생성자
		Computer8 com2 = new Computer8("AMD");
		Computer8 com3 = new Computer8("AMD", "SK");
		
		System.out.println("CPU: " + com1.CPU);
		System.out.println("RAM: " + com1.RAM);
		System.out.println("SSD: " + com1.SSD);
		
		System.out.println("CPU: " + com2.CPU);
		System.out.println("RAM: " + com2.RAM);
		System.out.println("SSD: " + com2.SSD);
		
		System.out.println("CPU: " + com3.CPU);
		System.out.println("RAM: " + com3.RAM);
		System.out.println("SSD: " + com3.SSD);
		
		// 생성자 오버로딩이 많아질 경우 복잡해지고 똑같은 코드가 계속 선언된다.
		// this를 활용하여 중복코드 최소화 
	}

}
