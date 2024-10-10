package Chapter6;

public class EX20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Random Number
		double ran1 = Math.random(); // 0 ~ 1.0 미만의 값
		double ran2 = Math.random() * 3; // 0 ~ 3.0 미만의 값
		int ran3 = (int)(Math.random() * 3 + 1); // 1 ~ 3 이하의 값
		int ran4 = (int)(Math.random() * (20 - 10 + 1) + 10); // 10 ~ 20 이하의 값
		
		System.out.println("ran1: " + ran1);
		System.out.println("ran2: " + ran2);
		System.out.println("ran3: " + ran3);
		System.out.println("ran4: " + ran4);
	}

}
