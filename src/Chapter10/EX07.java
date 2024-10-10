package Chapter10;

class Computer2 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer2(String setCPU) {
		CPU = setCPU;
	} 
}

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer2 com = new Computer2();
		// 기본 생성자가 명시적으로 되어있으면 자동으로 생성되지 않는다.
		System.out.println("CPU: " + com.CPU);
		System.out.println("RAM: " + com.RAM);
		System.out.println("SSD: " + com.SSD);
		 
	}

}
