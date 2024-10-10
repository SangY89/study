package Chapter5;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제3)
		// 0 - 10 까지 한 줄로 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i);
		}
		// 5 - 10 까지 한 줄로 출력
		System.out.println();
		for (int i = 5; i < 11; i++) {
			System.out.print(i);
		}
		// 5 - 10 + "안녕" 한 줄로 출력
		System.out.println();
		for (int i = 5; i < 11; i++) {
			System.out.print(i + "안녕");
		}
	}

}
