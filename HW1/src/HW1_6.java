import java.util.Scanner;

public class HW1_6 {

	public static void main(String[] args) {
		// 6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		// 사용자 입력 : 한 개의 두 자리 정수
		// 출력 : 자릿수의 순서가 반대로 된 정수
		
		int a, b, c;
		
		System.out.print("한 개의 두 자리 정수: ");
		
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		
		if (a >= 10 && a < 100) {
			b = a/10;
			c = a%10;
			System.out.println("자릿수의 순서가 반대로 된 정수: "+c+b);
		}

	}

}
