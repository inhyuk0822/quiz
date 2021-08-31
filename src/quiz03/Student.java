package quiz03;

public class Student {

	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String n, int No, int korean, int english, int mathmetics) {
		name = n;
		no = No;
		kor = korean;
		eng = english;
		math = mathmetics;
	}
	
	
	double getTotal() {
		return kor + eng + math;
	}
	
	double getAvg() {
		
		double avg = (int)(getTotal() / 3 * 100) / 100.0;
		return avg;
		
	}
	
	
	
}
