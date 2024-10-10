package Chapter10;

class Student3 {
	public String name = "펭수";
	public int age = 20;
	public String major = "펭귄학과";
	public void printStudentInfo(String name, int age, String major) {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("전공: " + major);
	}
	public void startStudying(String name, String major) {
		System.out.println(major + " 학과 " + name + " 님이 공부를 시작합니다." );
	}
}

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2번 문제 참고하여 startStudying 메서드 정의 후
		// 아래 문자열 처럼 출력되게 하시오.
		// 펭귄학과 학과 펭수 님이 공부를 시작합니다.
		Student3 sd = new Student3();
		sd.startStudying(sd.name, sd.major);
	}
}
