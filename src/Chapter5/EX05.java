package Chapter5;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문과 조건문을 이용하여 아래와 같이 출력하시오.
		// (hint : 다섯번 출력하고 줄 바꿈이 이루어져야 하므로,
		// 5의 배수마다 줄바꿈 처리 하도록 조건 설정)
		// for + if
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
			
		}
		
		// for + if - else
		for (int i = 1; i <= 25; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
			else {
				System.out.print(i + "\t");
			}
			
		}
	}

}
