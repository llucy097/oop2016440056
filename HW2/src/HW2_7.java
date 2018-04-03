import java.util.Scanner;

public class HW2_7 {

	public static void main(String[] args) {
		// 7. 0이 입력될 때까지 계속 정수를 입력 받고, 
		// 입력된 모든 숫자들의 총합을 출력하시오.
		
		int i, a, sum;
		i = 1;
		sum = 0;
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("정수를 입력하시요.");
		
		
		while (true) {
			a = input.nextInt();
			sum = sum + a;
			if (a == 0)
				break;
		}
		System.out.println("입력한 정수의 합: " + sum);
		

	}

}
