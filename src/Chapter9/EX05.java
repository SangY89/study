package Chapter9;

class Variable3{
	int var = 100;
	public void variable(){
		System.out.println("var: " + var);
	}
	public void func() {
		System.out.println("var: " + var);
	}
}

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable3.var = 300;
		Variable3 va = new Variable3();
		va.variable();
		va.func();
	}
}
