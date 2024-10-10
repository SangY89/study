package Chapter2;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ID = "TEST1234";
		int pass = 991005;
		System.out.println("ID : " + ID);
		System.out.println("Password : " + pass);
		
		int noodle = 5000 *3;
		int rice = 6000 * 2;
		int 할쿠 = 3000;
		
		int total = noodle + rice;
		int result = total - 할쿠;
		
		System.out.println("짜장면: " + noodle);
		System.out.println("볶음밥: " + rice);
		System.out.println("합계: " + total);
		System.out.println("최종금액: " + result);
	}

}
