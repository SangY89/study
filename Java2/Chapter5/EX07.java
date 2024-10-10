package Chapter5;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제7) 1 ~ 100 사이의 값 중 3의 배수이며,
		// 5의 배수에 해당하는 값을 출력하시오.
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		// && 는 중첩으로 할 수 있다.
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				if (i % 5 == 0) {
					System.out.println(i);
			}
		}
	}
}
