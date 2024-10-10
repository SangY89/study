package Chapter9;

class Variable1{
	int var = 100;
	public void variable(){
		System.out.println("var: " + var);
	}
	public void func() {
		System.out.println("var: " + var);
	}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable1 va = new Variable1();
		va.variable();
		va.func();
	}
}
