package Chapter11;

class Ferrari1 {
	private int year;
	public Ferrari1(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void speed() {
		System.out.println(getYear() + "년 식 페라리 최대 속도: 300km");
	}
}

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferrari1 myCar = new Ferrari1(2023);
		myCar.speed();
		
		// 오버라이딩
		// 오버라이딩은 자식클래스에서 부모클래스의 메서드를 재정의 하는 것
		// 부모클래스의 Method를 자신의 상태에 맞게 변경하여 사용이 가능
		// 오버라이딩된 Method 호출 시 자식 클래스에서 오버라이딩된 Method가 호출됨
		

		
	}

}
