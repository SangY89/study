package Chapter11;

interface TV {
	// 인터페이스 안에 있는 상수와 추상메서드는 알아서 처리가 된다.
	// 상수
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	
	// 추상메서드
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}

class QLEDTV implements TV { // 기능구현을 해줘야함
	@Override
	public void turnOn() {
		System.out.println("켜다");
	}
	@Override
	public void turnOff() {
		System.out.println("끄다");
	}
	@Override
	public void changeVolume(int volume) {
		System.out.println(volume + "으로 볼륨이 변경됩니다.");
	}
	@Override
	public void changeChannel(int channel) {
		System.out.println(channel + "으로 채널이 변경됩니다.");
	}
}

public class EX14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new QLEDTV();
		tv.turnOn();
		tv.changeChannel(9);
		tv.changeVolume(11);
		tv.turnOff();
		
		// 인터페이스 (상수, 추상메서드만 가질 수 있다)
		// 객체의 사용방법을 정의한 타입을 의미
		// 티비의 기능
		// 켜다, 끄다, 볼륨 조절, 채널 변경, 최소&최대 볼륨
	}

}
