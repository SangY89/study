package Quiz;

// 부모 클래스
class Shape1 {
	double length;
	
	Shape1 (double length) {
		this.length = length;
	}
	void draw() {
		System.out.println("도형을 그립니다.");
	}
}

// 자식 클래스 1
class Triangle1 extends Shape1 {
	Triangle1 (double length) {
		super(length);
	
	}
	
	@Override
	void draw() {
		System.out.println("정삼각형의 한 변의 길이가 " + length + " 으로 그립니다.");
	}
	
	double calculateArea() {
		return (Math.sqrt(3) / 4) * Math.pow(length, 2);
	}
}

// 자식 클래스 2
class Rectangle1 extends Shape1 {
	Rectangle1 (double length) {
		super(length);
		
	}
	
	@Override
	void draw() {
		System.out.println("정사각형 한 변의 길이가 가로 " + length + " 으로 그립니다.");
	}
	
	double calculateArea() {
		return length * length;
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle1 triangle = new Triangle1(3.0);
		Rectangle1 rectangle = new Rectangle1(3.0);
		
		// 삼각형
		triangle.draw();
		System.out.println("정삼각형의 넓이: " + triangle.calculateArea());
		
		System.out.println();
		// 사각형
		rectangle.draw();
		System.out.println("정사각형의 넓이: " + rectangle.calculateArea());
	}

}
