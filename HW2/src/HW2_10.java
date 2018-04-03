import java.util.Scanner;

public class HW2_10 {

	public static void main(String[] args) {
		// 10. 소수(prime-number) 검사와 흡사하게 사용자가 입력한 수의 
		// 인수들을 모두 출력하는 프로그램을 작성하시오.
		
		int i, a;
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		a = input.nextInt();
		System.out.print(a+"의 인수: ");
		for (i=1; i<=a; i++) {
			if (a%i == 0) {
				System.out.print(i + " ");
				continue;
			}
			else
				continue;
		}


	}

}
