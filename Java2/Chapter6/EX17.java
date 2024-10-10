package Chapter6;

public class EX17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for each문
		// 반복되는 자료 구조에서 값을 꺼낼 때 사용
		// for(타입 변수: 배열) {
		//	  실행문;
		// }
		int[] arrayInt10 = {10, 20, 30, 40, 50};
		
		// for문
		for (int i = 0; i < arrayInt10.length; i++) {
			System.out.println(arrayInt10[i]);
		}
		System.out.println();
		// forEach문
		for (int num : arrayInt10) {
			System.out.println(num);
		}
	}

}
