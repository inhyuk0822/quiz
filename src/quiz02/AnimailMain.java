package quiz02;

public class AnimailMain {
	
	public static void main(String[] args) {
		
		Animal A1 = new Animal("사자", "육식", 800, 200);
		A1.info();
		
		System.out.println("----------------------");
		
		Animal A2 = new Animal();
		A2.name = "기린";
		A2.food = "초식";
		A2.weight = 700;
		A2.tall = 1000;
		
		A2.info();
	
				
	}

}
