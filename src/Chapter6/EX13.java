package Chapter6;

public class EX13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열 같은 타입의 데이터를 연속된 공간에 나열하고,
		// 인덱스를 부여해 놓은 2차원 자료구조
		// ex) new int[3][4] 
		// 2차원 배열 선언
		int[][] arrayInt6 = new int[3][4];
		// arrayInt6[0] = 10;
		// Type mismatch: cannot convert from int to int[]
		
		 arrayInt6[0][0] = 10;
		 System.out.println(arrayInt6[0][0]);
	}

}
