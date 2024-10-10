package Chapter5;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 for문을 이용하여 구구단표 작성
		// 가로
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.print(i + "X" + j +  "=" + i*j + "\t");
				if(j == 9) {
					System.out.println();
				}
			}
		}
		System.out.println();
		// 세로
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <=9; j++) {
				System.out.print(j + "X" + i +  "=" + i*j + "\t");
				if(j == 9) {
					System.out.println();
				}
			}
		}
	}

}
