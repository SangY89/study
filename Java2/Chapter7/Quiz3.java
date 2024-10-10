package Chapter7;

class StudentReturn {
	public int Wavr() {
		int w_avr = (100+100+100) / 3;
		return w_avr;
	}
	public int Aavr() {
		int a_avr = (90+90+90) / 3;
		return a_avr;
	}
	public int Ravr() {
		int r_avr = (80+80+80) / 3;
		return r_avr;
	}
	
}

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentReturn SR = new StudentReturn();
		
		System.out.println("장원영의 성적 평균은 " + SR.Wavr() + "입니다.");
		System.out.println("안유진의 성적 평균은 " + SR.Aavr() + "입니다.");
		System.out.println("가을의 성적 평균은 " + SR.Ravr() + "입니다.");
	}

}
