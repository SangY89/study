package Chapter12;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int[] arr = {1,2,3};
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("인덱스 범위를 벗어났습니다.");
		}
		
	}
}
