package Quiz;

abstract class Shape2   {
	double length;
	void calculateArea() {
		
	}
	
	abstract void draw();
}

class Circle2 extends Shape2 {
	double radius;
	Circle2 (double radius){
		this.radius = radius;

	}
	
	@Override
	void draw() {
		System.out.println("반지름이 " + radius + " 으로 그립니다.");
	}
	
	double calulateArea() {
		System.out.println(radius * radius * Math.PI);
		return radius;
	}
	
}

class Rectangle2 extends Shape2 {
	double width;
	double height;

	Rectangle2 (double width, double height){
		this.width = width;
		this.height = height;
		
	}
	@Override
	void draw() {
		System.out.println("가로 길이가 " + width + " 세로 길이가 " + height + " 으로 그립니다.");
	}
	
	double calulateArea() {
		return width * height;
	}
	
}

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 circle = new Circle2(5.0);
		Rectangle2 rectangle = new Rectangle2(5.0, 9.0);
		
		circle.draw();
		System.out.println("원의 넓이: " + circle.calulateArea());
		
		System.out.println();
		rectangle.draw();
		System.out.println("사각형의 넓이: " + rectangle.calulateArea());
	}

}
