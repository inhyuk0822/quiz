package quiz03;

public class StudentMain {
	
	public static void main(String[] args) {
		/*
		 * 멤버변수
		 * name - 학생이름
		 * no - 학생번호
		 * kor - 국어점수
		 * eng - 영어점수
		 * math - 수학점수
		 * 
		 * 생성자
		 * 멤버변수 5개를 초기화 하는 생성자
		 * 
		 * getTotal() - 국어, 영어, 수학 점수를 모두 더해서 합계반환
		 * getAvg() - 총점을 나눈 평균을 반환(단,소수점 2자리까지)
		 * 
		 * main에서는 학생의 2명을 각각 생성하고 두 학생의 평균합을 출력하세요
 		 */
		
		Student stu1 = new Student("홍길동", 12, 80, 92, 63);
		
		Student stu2 = new Student("아무개", 25, 79, 48, 95);
		
		
		System.out.println("평균합:" + stu1.getAvg() + stu2.getAvg());
	}

}
