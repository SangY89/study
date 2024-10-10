package Chapter6;

public class EX14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayInt7 = new int[3][];
		// arrayInt7[0][0] = 10;
		// java.lang.NullPointerException
		// 길이를 다르게 선언할 수 있고 이것을 가변 길이 배열이라 한다.
	
		// 가변 길이 배열
		arrayInt7[0] = new int[1];
		arrayInt7[1] = new int[2];
		arrayInt7[2] = new int[3];
		
		arrayInt7[0][0] = 10;
		System.out.println(arrayInt7[0][0]);
		
	}

}
