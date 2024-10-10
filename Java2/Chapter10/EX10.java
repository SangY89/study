package Chapter10;

class Computer5 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer5(String CPU) {
		this.CPU = CPU;
	} 
	
	Computer5(){ } 
}

public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer5 com1 = new Computer5(); // 기본 생성자
		
		System.out.println("CPU: " + com1.CPU);
		System.out.println("RAM: " + com1.RAM);
		System.out.println("SSD: " + com1.SSD);
		
		Computer5 com2 = new Computer5("AMD"); // 기본생성자 명시적 선언
		
		System.out.println("CPU: " + com2.CPU);
		System.out.println("RAM: " + com2.RAM);
		System.out.println("SSD: " + com2.SSD);
		
		Computer5 com3 = new Computer5("Samsung"); // 기본생성자 명시적 선언
		
		System.out.println("CPU: " + com3.CPU);
		System.out.println("RAM: " + com3.RAM);
		System.out.println("SSD: " + com3.SSD);
		
	}

}
