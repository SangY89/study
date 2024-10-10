package Chapter7;

// 필드(field)

class Car {
	String company = "제네시스";
	String model  = "GV90";
	String color = "White";
	int maxSpeed = 200;
	int rpm;
	int currentSpeed;
	boolean enginStart;
}

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 지향 프로그래밍
		// 객체(Object)
		// 현실 세계의 개념, 사물 또는 엔티티를 프로그램에서 표현한 것으로
		// 객체는 속성(데이터)과 메서드(동작)을 가짐
		// 객체 = 속성(Attribute) + 동작(Funtion)
		//	   = 필드(Field) + 메서드(Method)
		
		// 절차 지향 프로그래밍
		// 프로그램을 수행해야 하는 단계로 나누고, 각 단계에서 어떤 작업을 수행할지 명시하는 방식
		
		
		// 객체 지향 프로그래밍 (Object-Oriented Programming, OOP)
		// 현실 세계의 객체를 모델링하고, 그 객체들 간의 상호작용을 통해 프로그램을 구성하는 방식
		
		// 클래스(Class) - 붕빵의 틀
		// 붕빵 만들기 ! 밀가루 물 팥
		// 1.반죽 ★2.모양 만들기★ 3.굽기
		
		// 객체의 설계도 또는 틀을 나타냅니다. 클래스느 객체를 생성하기 위한 템플릿
		// 역할을 하며, 객체를 생성하기 위한 속성과 메서드를 정의합니다.
		
		// class 클래스명{
		//	  필드
		//	  생성자
		//	  메서드	
		//	  }
		// 클래스명 객체명 = new 생성자();
		
		// 필드
		// 필드는 객체 내부엥 존재하며, 객체의 상태 데이터를 저장하는 공간으로
		// 객체의 필드에 접근할 때에는 도트(".")연산자를 사용
		// class 클래스명{
		//		  타입 필드 = 값;
		//	   }
		
		// 객체 생성
		Car car = new Car();
		
		// 필드 데이터 출력
		System.out.println("제조회사: " + car.company);
		System.out.println("차모델명: " + car.model);
		System.out.println("색상이름: " + car.color);
		System.out.println("최대속도: " + car.maxSpeed);
		System.out.println("회전속도: " + car.rpm);
		System.out.println("현재속도: " + car.currentSpeed);
		System.out.println("시동여부: " + car.enginStart);
		
		System.out.println();
		// 필드 값 변경
		car.rpm = 3000;
		car.currentSpeed = 77;
		car.enginStart = true;
		
		System.out.println("회전속도: " + car.rpm);
		System.out.println("현재속도: " + car.currentSpeed);
		System.out.println("시동여부: " + car.enginStart);
		
		// public 클래스는 소스파일당 하나만 만들 수 있게 규정되어 있고
		// 하나의 소스파일당 한 클래스만 넣는게 제일 좋다
	}
}
