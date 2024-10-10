package Chapter6;

public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열은 반복문과 같이 많이 사용 된다
		// 인덱스 출력(정수 배열)
		int[] arrayInt1 = new int[10];
		for (int i = 0; i < arrayInt1.length; i++) {
			System.out.println(i);
		}
		
		// 값 출력(정수 배열)
		int[] arrayInt2 = {1,3,5,7,9};
		for (int i = 0; i < arrayInt2.length; i++) {
			System.out.println(arrayInt2[i]);
		}
		
		// 인덱스 출력(문자열)
		String[] arrayStr1 = new String[10];
		for (int i = 0; i < arrayStr1.length; i++) {
			System.out.println(i);
		}
		
		// 값 출력(문자열 배열)
		String[] arrayStr2 = {"A", "B", "C"};
		for (int i = 0; i < arrayStr2.length; i++) {
			System.out.println(arrayStr2[i]);
		}
	}

}
