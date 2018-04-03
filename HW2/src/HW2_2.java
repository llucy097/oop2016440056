import java.util.Scanner;

public class HW2_2 {

	public static void main(String[] args) {
		// 2. 10개의 정수를 입력 받아 그 총합을 출력하는 프로그램을 작성하시오.
		
		int i, a;
		int sum;
		Scanner input = new Scanner (System.in);
		
		i = 1;
		sum = 0;
		
		System.out.println("정수를 입력하세요.");
		while (i <= 10) {
			System.out.println(i + "번 째 정수 : ");
			a = input.nextInt();
			sum = sum + a;
			i++;
		}
		System.out.println("10개의 정수의 합은 : " + sum);

	}

}
