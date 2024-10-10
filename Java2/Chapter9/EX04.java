package Chapter9;

class Variable2{
	int var = 100;
	public void variable(){
		System.out.println("var: " + var);
	}
	public void func() {
		System.out.println("var: " + var);
	}
}

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable2 va = new Variable2();
		va.variable();
		va.func();
	}
}
