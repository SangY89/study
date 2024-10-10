package Chapter10;

class Computer3 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer3(String setCPU) {
		CPU = setCPU;
	} 
	
	Computer3(){ } // 기본 생성자를 수동으로 만들어주면 에러 해결
}

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer3 com = new Computer3();
		
		System.out.println("CPU: " + com.CPU);
		System.out.println("RAM: " + com.RAM);
		System.out.println("SSD: " + com.SSD);
		 
	}

}
