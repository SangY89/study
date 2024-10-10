package Chapter6;

public class EX18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열복사
		// System.arraycopy()메서드 사용법
		// System.arraycopy(object src, int srcPos, object dest, int desyPos, int length)
		// 					원본배열, 복사할 항목의 시작 인덱스, 새배열, 붙여넣을 시작 인덱스, 복사할 개수
		
		// 배열 복사1
		int[] oldArrayint = {1,2,3};
		int[] newArrayint = new int[5];
		
		for (int i = 0; i < oldArrayint.length; i++) {
			newArrayint[i] = oldArrayint[i];
		}
		
		for (int i = 0; i < newArrayint.length; i++) {
			System.out.println(newArrayint[i]);
		}
	}

}
