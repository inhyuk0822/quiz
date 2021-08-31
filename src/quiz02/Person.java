package quiz02;

public class Person {
	
	String name;
	int age;
	int tall;
	
	Person(String Nname, int Aage, int Ttall) {
		name = Nname;
		age = Aage;
		tall = Ttall;
	}
	//생성자를 직접 만들게 되면, 자바가 기본생성자를 자동으로 생성하지 않습니다
	Person() {
		
	}
	void info() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age + "세");
		System.out.println("키:" + tall + "cm");
	}

}
