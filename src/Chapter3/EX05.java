package Chapter3;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감 연산자
		double su = 11.2;
		su++; System.out.println("su++: " + su);
		++su; System.out.println("++su: " + su);
		su--; System.out.println("su--: " + su);
		--su; System.out.println("--su: " + su);
		
		int data1, data2, data3;
		data1 = 10; data2 = ++data1;
		data1 = 10; data3 = data1++;
		System.out.println("data2: " + data2);
		System.out.println("data3: " + data3);
	}

}
