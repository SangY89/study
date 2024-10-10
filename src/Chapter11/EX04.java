package Chapter11;

class Calc2 {
	public Calc2(String n) {
		System.out.println(n);
	}
}

class ComputerCalc2 extends Calc2 {
	public ComputerCalc2(String n) {
		super(n); // 부모클래스에 있는 생성자를 쓸 때 정의한다.
		System.out.println("Computer");
	}
}

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerCalc2 com = new ComputerCalc2("Test");
	}

}
