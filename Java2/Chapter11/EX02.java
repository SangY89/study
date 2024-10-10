package Chapter11;

class Car {
	String company = "페라리";
	String model;
	int maxSpeed;
}

class SuperCar extends Car{
	SuperCar(){
		this("F8", 350);
	}
	SuperCar(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	public void printMethod() {
		System.out.println("제조사: " + this.company);
		System.out.println("모델명: " + this.model);
		System.out.println("최대 속도: " + this.maxSpeed);
	}
}

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCar car_1 = new SuperCar();
		car_1.printMethod();
		SuperCar car_2 = new SuperCar("F11", 400);
		car_2.printMethod();
	}

}
