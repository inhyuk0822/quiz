package quiz08;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp s = new SuperSonicAp("아시아나");
		s.takeOff();
		s.fly(); //오버라이딩된 메서드
		s.flyMode = 1;
		s.fly();
		s.land(); //물려받은
		System.out.println("이름" + s.info());
		
		
	}
}
