package quiz02;

public class Animal {
	
	String name;
	String food;
	int weight;
	int tall;
	
	Animal(String pname, String pfood, int pweight, int ptall) {
		name = pname;
		food = pfood;
		weight = pweight;
		tall = ptall;
	}
	
	Animal() {
		
	}
	
	
	
	void info() {
		System.out.println("동물이름:" + name);
		System.out.println("주식:" + food);
		System.out.println("무게:" + weight + "kg");
		System.out.println("키:" + tall + "cm");
	}

}
