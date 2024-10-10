package Chapter5;

public class EX16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, numSum = 0;
		
		// do - while 반복문 기본 구조
		do {
			num++;
			numSum += num;
		} while(num < -1);
		
		System.out.println("do - while numSum: " + numSum);
		
		// while
		num = 0; numSum = 0;
		while(num <= -1) {
			num++;
			numSum += num;
		}
		System.out.println("while numSum: " + numSum);
	}

}
