import java.util.Scanner;

public class HW1_1 {

	public static void main(String[] args) {
		// 1. 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.
		
		System.out.println("1번 문제");
		
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하시오: ");
		a = input.nextInt();
		System.out.println("두 번째 정수를 입력하시오: ");
		b = input.nextInt();
		
		if (a > b) 
			System.out.println("큰 수는 " + a + "입니다.");
		else
			System.out.println("큰 수는 " + b + "입니다.");
		
		System.out.println("=======시스템종료=======");

		
		

	}

}
