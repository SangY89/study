package Chapter11;

public class EX17 {
	
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender1;
		gender1 = EX17.MALE;
		System.out.println("성별: " + gender1);
		
		gender1 = EX17.FEMALE;
		System.out.println("성별: " + gender1);
		
		gender1 = "boy";
		System.out.println("성별: " + gender1);
		
		
		// 열거형(enum)
		// 관련 있는 상수들의 집합을 의미
		// enum {
		//	  상수, 상수, 상수...
		// }
	}

}
