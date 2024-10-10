package Chapter9;

class Variable4{
	static int var = 100;
	public void variable(){
		System.out.println("var: " + var);
	}
	public void func() {
		System.out.println("var: " + var);
	}
}

public class EX06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable4.var = 300;
		Variable4 va = new Variable4();
		va.variable();
		va.func();
	}
}
