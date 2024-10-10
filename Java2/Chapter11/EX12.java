package Chapter11;

abstract class HyperCar {
	public abstract void HyperCarRun();
}

class Bugatti extends HyperCar {
	@Override
	public void HyperCarRun() {
		System.out.println("SuperCar Bugatti Run!");
	}
}

class Laferrari extends HyperCar {
	@Override
	public void HyperCarRun() {
		System.out.println("SuperCar Laferrari Run!");
	}
}

// 현대 자동차
class HyunDai extends HyperCar {
	@Override
	public void HyperCarRun() {
		System.out.println("SuperCar? HyunDai? Run!");
	}
}

class Driver {
	public void drive(HyperCar hyperCar) {
		hyperCar.HyperCarRun();
	}
}

public class EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver drive = new Driver();
		drive.drive(new Bugatti());
		drive.drive(new Laferrari());
		drive.drive(new HyunDai());
	
	}

}
