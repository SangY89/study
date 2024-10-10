package Chapter12;

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int[] arr = {1,2,3};
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}	// 예외객체 담긴 걸 출력해주는 것 getMessage
	
	}
}
