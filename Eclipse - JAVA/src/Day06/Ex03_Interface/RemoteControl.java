package Day06.Ex03_Interface;

public interface RemoteControl {
	
	// 상수
	// 인터페이스 변수는 public static final 로 자동으로 선언된다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// : (public abstract) 를 생략하고 작성할 수 있다.
	void turnOn();					// 전원 On
	void turnOff();					// 전원 Off
	void setVolume(int volume);		// 볼륨 설정
	
	// 디폴트 메소드
	// : 구현 객체에 할당될 인스턴스 메소드
	default void setMute(boolean mute) {
		if( mute ) {
			System.out.println("음소거 설정");
		} else {
			System.out.println("음소거 해제");
		}
	}
	
	// static 메소드(정적 메소드)
	// : 구현 객체가 없어도 인터페이스 만으로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환");
	}
	
	

}





