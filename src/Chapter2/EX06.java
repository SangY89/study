package Chapter2;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료형 변환
		// Promotion : 작은 범위의 자료형을 큰 범위의 자료형 대입
		// long = int
		// int = short
		// short = byte
		
		// Casting : 큰 범위의 자료형을 작은 범위의 자료형 대입
		// byte = short
		// short = int
		// int = long
		// byte < short, char < int < long < float < double
		// 1		2     2     4       8      4       8
		
		// Promotion
		int x = 10000; // int > 4byte
		long y = x; // long > 8byte8
		System.out.println(y);
		
	}

}
