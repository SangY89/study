package Chapter5;

public class EX17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제17) 조건식에 true 사용하여 1 - 10까지 출력
		// 출력 이후 종료 되게 하기(키워드 사용X)
		
		int i = 1;
		boolean a = true;
		while(a) {
			System.out.println(i);
			if(i == 10) {
				a = false;
			}
			i++;
		}
	}
}
