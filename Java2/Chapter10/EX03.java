package Chapter10;

// Getter & Setter(비공개형)

import java.util.Scanner;

class SetGet_01 {
	private String name;
	private void setName() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력: ");
		this.name = input.next();
		input.close();
	}
	private String getName() {
		return this.name;
	}
	public void nameSetGet() {
		setName();
		System.out.println("이름 출력: " + getName());
	}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetGet_01 sg = new SetGet_01();
		sg.nameSetGet();
		
		
		// 정보은닉
		// 클래스의 필드변수의 접근제한을 통해 클래스의 정보를 숨기는 행위를 의미
		// 모든 멤버변수가 외부에 공개되어있을 경우 누구나 클래스의 멤버변수 값을
		// 임의로 조작할 수 있는 상태가 만들어질 수 있음
		
		// 클래스의 정보은닉을 구현하기위해서는 멤버변수의 접근제한자 Private 설정을
		// 통해 외부에서의 접근제한을 명시
		
		// 접근제한이 설정된 멤버변수의 값은 객체내부의 검사 및 검증 작업을 진행한 후
		// 멤버변수의 값을 변경할 수 있도록 구현위와 같은 형태로 클래스의 내부구조를
		// 구성하는 것을 클래스의 정보은닉이라 표현
		
		// 붕붕이 클래스 만듦 -> 색깔,모델명,제조회사,속도
		// 누구든지 접근하게 만들면 맘대로 바꿔버릴 수 있음
		
		// 캡슐화
		// 하나의 온전한 기능을 수행할 수 있는 클래스를 정의한 것을 의미
		// 객체 지향 프로그래밍(OOP)에서 사용되는 중요한 개념 중 하나로, 관련된
		// 데이터와 기능을 하나의 단위로 묶고, 외부에서의 접근을 제한하는 것을 의미하며
		// 메서드를 사용하여 데이터에 접근하도록 제어함으로써, 데이터의 부적적한
		// 직접적인 접근을 막음
		
		// Getter & Setter
		// 접근제한이 설정된 필드변수의 접근하기 위한 메서드
		// Getter Method : 필드변수의 값을 사용할 때 사용
		// Setter Method : 필드변수의 값을 설정할 때 사용
		
		// Getter, Setter 는 프로그매러들간 약속된 이름구조 (다른이름 사용가능)
		// Getter Method 이름지정 기본형식 : get + Field name (getName)
		// Setter Method 이름지정 기본형식 : set + Field name (setName)
	}

}
