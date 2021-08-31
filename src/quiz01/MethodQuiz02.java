package quiz01;

import java.util.Arrays;

public class MethodQuiz02 {

	public static void main(String[] args) {
	
		
		
		String str = java(5);
		System.out.println(str); //문자붙이기
		
		System.out.println(sum(10)); //약수의합
		
		System.out.println(primeNum(10)); //소수의 개수: 2,3,5,7
		
		System.out.println("7~9의 사이의 수의합: " + sumNum(7, 9));
		System.out.println("9~7의 사이의 수의합: " + sumNum(9, 7));
		System.out.println("5~5의 사이의 수의합: " + sumNum(5, 5));
		
		System.out.println(test(10230543));
	}
	
	
	static String java(int a) {
		String s = "";
		
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 1) {
				s += "자";
			} else {
				s += "바";
			}
		}
		
		return s;
		
		
	}

	static int sum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i++)
			if(a % i == 0) {
				sum += i;
			}
		
		
		return sum;
		
		
	}

	static int primeNum(int a) {
		
		int sum = 0; //소수의 개수
		for(int i = 1; i <= a; i++) {
			
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
			}
				
				}
			if(count == 2) sum++;
		}
	
			return sum;
		}
	
	static int test(int a) {
		int sum = 0;
		for(int i = 100000000; i >= 1; i/=10) {
			if(a / i != 0) { //몫이 있는 경우
				sum += (a / i); //몫을 구해서 누적
				a %= i;
			}
		}
		
		
		return sum;
		
	
	/*
	 * 자연수 자리수의 합 구하기
	 * 자연수 n이 매개변수로 주어지면 n자리수의 합을 구해서 return하는 메서드
	 * 조건
	 * n은 1억 이하의 자연수
	 * n의 자료형을 바꾸면 안됩니다
	 * 
	 * ex) 10230543 -> 18
	 */
	}
	
	static int sumNum(int a, int b) {
		int sum = 0;
		int max = a > b ? a : b;
		int min = b > a ? a : b;
		for(int i = min; i <= max; i++) {
			sum += i;
			
			
		
	}
		return sum;
		}
		
	
	
	
	
	}

