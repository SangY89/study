package Chapter10;

class Student2 {
	public String name = "펭수";
	public int age = 20;
	public String major = "펭귄학과";
	public void printStudentInfo(String name, int age, String major) {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("전공: " + major);
	}
}

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student1 클래스 정의하여 학생정보
		// name, age, major 필드에 저장 후
		// printStudentInfo 메소드 정의하여
		// 학생 정보 출력
		Student2 sd = new Student2();
		sd.printStudentInfo(sd.name, sd.age, sd.major);
	}

}
