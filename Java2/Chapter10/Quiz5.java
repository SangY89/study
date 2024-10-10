package Chapter10;

class Benz {
	String name = "Benz";
	String model = "E350d";
	int year = 2024;
}

class Bmw {
	String name = "Bmw";
	String model = "ix";
	int year = 2024;
}

class Genesis {
	String name = "Genesis";
	String model = "G80";
	int year = 2024;
}

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동차 클래스 생성하여 벤츠, BMW, 현대 자동차
		// 객체 생성하여 아래와 같이 정보 출력
		Benz bz = new Benz();
		Bmw bw = new Bmw();
		Genesis gn = new Genesis();
		
		System.out.println("brand : " + bz.name);
		System.out.println("model : " + bz.model);
		System.out.println("year : " + bz.year);
		
		System.out.println("brand : " + bw.name);
		System.out.println("model : " + bw.model);
		System.out.println("year : " + bw.year);
		
		System.out.println("brand : " + gn.name);
		System.out.println("model : " + gn.model);
		System.out.println("year : " + gn.year);
	}

}
