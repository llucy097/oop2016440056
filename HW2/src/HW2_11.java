import java.util.Scanner;

public class HW2_11 {

	public static void main(String[] args) {
		// 11. 10번의 문제를 0을 입력하기 전까지는 계속 수행하도록 수정.
		
		int i, a;
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("");
			System.out.println("정수를 입력하시오.");
			
			a = input.nextInt();
			if (a == 0)
				break;
			else {
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

}
}