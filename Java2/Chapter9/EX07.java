package Chapter9;

class Variable5 {
	public int cnt = 10;
	public void func() {
		System.out.println("cnt: " + cnt);
	}
}

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable5 var1 = new Variable5();
		var1.func();
		Variable5 var2 = new Variable5();
		var2.func();
		Variable5 var3 = new Variable5();
		var3.func();
		
	}

}
