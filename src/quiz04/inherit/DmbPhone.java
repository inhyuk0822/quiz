package quiz04.inherit;

public class DmbPhone extends Phone {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	
	int channel;
	
	DmbPhone(String col, String mod, int cha) {
		color = col;
		model = mod;
		channel = cha;
	}
	void turnOnDmb() {
		System.out.println("TV를 켭니다");
		
	}
	int changeChannel(int a) {
		channel = a;
		System.out.println("변경된 채널:" + channel);
		return channel;
	}
	void turnOffDmb() {
		System.out.println("TV를 끕니다");
	}
	
}
