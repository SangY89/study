package Chapter11;

enum Gender {
	MALE, FEMALE;
}

public class EX18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender gender2;
		gender2 = Gender.MALE;
		System.out.println("성별: " + gender2);
		gender2 = Gender.FEMALE;
		System.out.println("성별: " + gender2);
		gender2 = "girl";
		System.out.println("성별: " + gender2);
		// 변수에 원하는 상수값을 넣고 싶을때 열거형 사용
	}

}
