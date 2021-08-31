package quiz09;

public class User {
	
	private String name;
	private int rnn;
	private int age;
	
	public User() {
		
	}
	//모든 멤버변수를 초기화하는 생성자
	public User(String name, int rnn, int age) {
		this.name = name;
		this.rnn = rnn;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRnn() {
		return rnn;
	}
	public void setRnn(int rnn) {
		this.rnn = rnn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
}
