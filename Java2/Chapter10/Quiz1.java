package Chapter10;

class Student1 {
	public String name = "펭수";
	public int age = 20;
	public String major = "펭귄학과";
}

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student1 클래스 정의하여 학생정보
		// name, age, major 필드에 저장 후 꺼내어 출력
		Student1 sd = new Student1();
		
		System.out.println("이름: " + sd.name);
		System.out.println("나이: " + sd.age);
		System.out.println("전공: " + sd.major);
	}

}
