package Chapter12;

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실행 예외
		try {
			String str = null;
			System.out.println(str.charAt(0));
		} catch (NullPointerException n) {
			System.out.println("NullPointerException 발생!");
		} finally {
			System.out.println("무조건 실행되며 생략 가능!");     
		} 
		
	}

}
