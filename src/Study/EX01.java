package Study;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("뽀야미", 5000);
		Student student2 = new Student("애플이", 5000);
		
		Bus bus = new Bus(100);
		Subway subway = new Subway("2호선");
		
		// 뽀야미가 버스 탑승 전
		student1.showInfo();
		bus.showInfo();
		System.out.println();
		// 뽀야미가 버스 탑승 후
		student1.takeBus(bus);
		student1.showInfo();
		bus.showInfo();
		System.out.println();
		
		// 애플이가 지하철 탑승 전
		student2.showInfo();
		subway.showInfo();
		System.out.println();
		
		// 애플이가 지하철 탑승 후
		student2.takeSubway(subway);
		student2.showInfo();
		subway.showInfo();
		
		
		// 객체의 상호작용
		// 소프트웨어 개발 방법론 중의 하나로 현실 세계의 개념을 소프트웨어
		// 모델링의 기초로 삼아 시스템을 설계하고 구현하는 방법
	}

}
