package quiz02;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20, 180);
		p1.info();
		
		System.out.println("----------------");
		
		Person p2 = new Person();
		p2.age = 40;
		p2.name = "김길동";
		p2.tall = 170;
		
		p2.info();
		
		System.out.println("---------------------");
		//2. 일상생활에서 있을법한 사물,동물 클래스로 표현하고 객체로 생성해보세요
		Tv tv = new Tv();
		tv.power();
		tv.changeChannel(10); //채널변경
		tv.info();
		
	}

}
