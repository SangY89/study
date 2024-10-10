package Chapter7;

class Student {
	int w_k = 100;
	int w_e = 100;
	int w_m = 100;
	
	int a_k = 90;
	int a_e = 90;
	int a_m = 90;
	
	int r_k = 80;
	int r_e = 80;
	int r_m = 80;
}

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		int w_avr = (student.w_k + student.w_e + student.w_m) / 3;
		int a_avr = (student.a_k + student.a_e + student.a_m) / 3;
		int r_avr = (student.r_k + student.r_e + student.r_m) / 3;
		
		System.out.println("장원영의 성적 평균은 " + w_avr + "입니다.");
		System.out.println("안유진의 성적 평균은 " + a_avr + "입니다.");
		System.out.println("가을의 성적 평균은 " + r_avr + "입니다.");
	}

}
