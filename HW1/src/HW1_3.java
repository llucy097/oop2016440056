import java.util.Scanner;

public class HW1_3 {

	public static void main(String[] args) {
		// 3. 세 수(정수형)를 입력받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
		
		System.out.println("3번 문제");

		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하시오 : ");
		a = input.nextInt();
		System.out.println("두 번째 정수를 입력하시오 : ");
		b = input.nextInt();
		System.out.println("세 번째 정수를 입력하시오 : ");
		c = input.nextInt();
		
		if (a>b && a>c)
			System.out.println("가장 큰 수는 " + a + "이다.");
		else if (b>a && b>c)
			System.out.println("가장 큰 수는 " + b + "이다.");
		else
			System.out.println("가장 큰 수는 " + c + "이다.");
		
		System.out.println("=======시스템종료=======");
		
	}

}
