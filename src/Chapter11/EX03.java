package Chapter11;

class Calc1 {
	public Calc1(String n) {
		System.out.println("Calc");
	}
}

class ComputerCalc1 extends Calc1 {
	public ComputerCalc1() {
		super(); // 부모클래스에 있는 생성자를 쓸 때 정의한다.
		System.out.println("Computer");
	}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerCalc1 com = new ComputerCalc1();
		
	}

}
