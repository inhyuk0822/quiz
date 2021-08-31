package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		c.computerInfo();
		
		System.out.println("-----------------------");
		Monitor mt = c.getMt();
		mt.info();
		
	}
}
