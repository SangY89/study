package Chapter6;

public class EX21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제3) while문 사용하여 1 ~ 45까지 범위의 난수 6개를 발생하여 출력하시오.
		int i = 0;
		while(i < 6) {
			int ran = (int)(Math.random() * 45 + 1);
			System.out.println(ran);
			i++;
		}
	}

}
