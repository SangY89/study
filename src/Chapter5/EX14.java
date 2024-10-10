package Chapter5;

public class EX14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break: 반복의 종료
		// 예제14) 조건식에 true 사용하여
		// 1 - 10 까지 출력하기
		int i = 1;
		
		while(true) {
			if(i <= 10) {
				System.out.println(i);
			} else {
				break;
			}
			i++;
		}
		
	}

}
