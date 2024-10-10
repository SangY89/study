package Chapter5;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫 날에 10원을 예금하고, 다음날에는 전날의 2배를 예금하는 방식으로
		// 한 달(30)동안 저축한 금액을 구하시오.
		long won = 10;
		long Dp = 0;
		
		for (int i = 1; i < 31; i++) {
			Dp += won;
			won *= 2;
		}
		System.out.println(Dp);
	}

}
